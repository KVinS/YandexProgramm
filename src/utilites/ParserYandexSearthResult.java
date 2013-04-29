/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilites;

import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Эдуард
 */
public class ParserYandexSearthResult {

    public static void parsing(String searthResultXML) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(false);
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource xml_source = new InputSource(new StringReader(searthResultXML));
            Document doc = builder.parse(xml_source);

            Node node = doc.getChildNodes().item(0);
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
             Node nodik = children.item(i);
             NamedNodeMap attributes = nodik.getAttributes();
            }

        } catch (ParserConfigurationException | IOException | SAXException ex) {
            Logger.getLogger(ParserYandexSearthResult.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}