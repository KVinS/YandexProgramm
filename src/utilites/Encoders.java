/*
 * В этом классе хранятся функции для перевода информации полученной от пользователя в API пригодный вид
 */
package utilites;

/**
 *
 * @author Эдуард
 */
public class Encoders {
    
    public static String languageNumToLanguageName(int languageNum) {
        switch (languageNum) {
            case 0:
                return "ru";
            case 1:
                return "ua";
            case 2:
                return "by";
            case 3:
                return "kz";
            default:
                return "ru";
        }
    }

    public static String filterNumToFilterName(int filterNum) {
        switch (filterNum) {
            case 0:
                return "none";
            case 1:
                return "moderate";
            case 2:
                return "strict";
            default:
                return "none";
        }
    }
    
    
    public static String sortNumToSortName(int filterNum) {
        switch (filterNum) {
            case 0:
                return "sortby=rlv";
            case 1:
                return "sortby=tm.order%3Ddescending";
            case 2:
                return "sortby=tm.order%3Dascending";
            default:
                return "sortby=rlv";
        }
    }
    

    public static int regionNumToRegionName(int regionNum) {
        switch (regionNum) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}
