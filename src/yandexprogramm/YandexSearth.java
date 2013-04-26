/*
 * Основной класс программы
 */
package yandexprogramm;

import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * @author Эдуард
 */
public class YandexSearth extends Thread {

    public String yandex_api_url = "http://xmlsearch.yandex.ru/xmlsearch?user=KVinS-java&key=03.51068879:5fdd785e33efca2ec7c3914fa7331dba";
    interfaceProgram interFace; //Интерфейс
    String request; //Поисковый запрос
    int regionNum; //Выбранный регион
    int filterNum; //Выбранный фильтр
    int languageNum; //Выбранный язык
    Integer pageNum; //Выбранная страница
    int sortNum; //Выбранная сортировка

    public YandexSearth(interfaceProgram _interFace, String _request, int _regionNum, int _filterNum, int _languageNum, Integer _pageNum, int _sortNum) {
        interFace = _interFace;
        request = _request;
        regionNum = _regionNum;
        filterNum = _filterNum;
        languageNum = _languageNum;
        pageNum = _pageNum;
        sortNum = _sortNum;
        start();
    }

    @Override
    public void run() {

        String requestString = yandex_api_url + "&query=" + URLEncoder.encode(request) + "&filter=" + utilites.Encoders.filterNumToFilterName(filterNum) + "&lr=" + utilites.Encoders.regionNumToRegionName(regionNum) + "&l10n=" + utilites.Encoders.languageNumToLanguageName(languageNum) + "&page=" + pageNum + "&sortby=" + utilites.Encoders.sortNumToSortName(sortNum);

        URL api_url;

        try {
            api_url = new URL(requestString);
            URLConnection conn = api_url.openConnection();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document yandex_xml_document;
                yandex_xml_document = builder.parse(conn.getInputStream());
                NodeList documents_found = yandex_xml_document.getElementsByTagName("doc");



                for (int i = 0; i < documents_found.getLength(); i++) {
                    org.w3c.dom.Element element = (org.w3c.dom.Element) documents_found.item(i);
                    NodeList page_url = element.getElementsByTagName("url");
                    org.w3c.dom.Element line_url = (org.w3c.dom.Element) page_url.item(0);
                    System.out.println(line_url.getTextContent());

                    org.jsoup.nodes.Document hdoc;
                    try {
                        hdoc = org.jsoup.Jsoup.connect(line_url.getTextContent()).get();

                        File flt = new File(interFace.getSaveDirectory() + hdoc.title() + ".html");

                        flt.createNewFile();
                        try (FileWriter wrt = new FileWriter(flt)) {
                            interFace.writeToConsole("Создан файл " + hdoc.title() + ".html");
                            wrt.append(hdoc.html());
                            wrt.flush();
                        }
                    } catch (IOException ex) {
                        //Обработка случая, когда невозможно скачать страницу. Попытка скачать копию Яндекса. Скорее всего обломается из-за запрета ботам.
                        interFace.writeToConsole("Проблема с загрузкой страницы \"" + line_url.getTextContent() + "\"");
                        interFace.writeToConsole("Попытка скачать сохранённую копию \"" + line_url.getTextContent() + "\"");

                        page_url = element.getElementsByTagName("saved-copy-url");
                        line_url = (org.w3c.dom.Element) page_url.item(0);

                        System.out.println(line_url.getTextContent());
                        hdoc = org.jsoup.Jsoup.connect(line_url.getTextContent()).get();

                        File flt = new File(interFace.getSaveDirectory() + hdoc.title() + ".html");

                        flt.createNewFile();
                        try (FileWriter wrt = new FileWriter(flt)) {
                            interFace.writeToConsole("Создан файл " + hdoc.title() + ".html");
                            wrt.append(hdoc.html());
                            wrt.flush();
                        }
                    }
                }
            } catch (ParserConfigurationException | SAXException ex) {
                interFace.writeToConsole("Проблема по разбору ответа на запрос \"" + request + "\".html");
            }
        } catch (IOException ex) {
            interFace.writeToConsole("Проблема с подключением к Яндексу. Пожалуйста, проверьте соединение с интернетом");
        }
    }
}
