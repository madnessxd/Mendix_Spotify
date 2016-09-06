import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Grim Reaper on 06/09/2016.
 */
public class Main {
    //Alleen voor search()
    public enum SearchType{
        Artist("artist"),
        Album("album"),
        Playlist("playlist"),
        Track("track");

        private String value;
        private SearchType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    private String webRequest(String url){
        String response = "";
        try {
            URLConnection connection = new URL(url).openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            StringBuilder sb = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            response = sb.toString();
        } catch (Exception e){}
        return response;
    }

    //--------------------------------------------------//
    /* Niet meer naar de bovenkant kijken als het werkt.*/
    //--------------------------------------------------//

    private String getArtistInfo(String id){
       return webRequest("https://api.spotify.com/v1/artists/" + id);
    }

    private String getTrackInfo(String id){
        return webRequest("https://api.spotify.com/v1/tracks/" + id);
    }

    /*private  String getTrackFeatures(String id){
        return webRequest("https://api.spotify.com/v1/audio-features/" + id);
    }*/
    private String getAlbumInfo(String id){
        return webRequest("https://api.spotify.com/v1/albums/" + id);
    }

    //TODO: limit inbouwen (offset voor extra pagina's)
    private String search(String searchString, SearchType searchType){
        return webRequest("https://api.spotify.com/v1/search?q=" + searchString + "&type=" + SearchType.Artist);
    }

    //TODO: dit in mendix pleuren \/
    Main(){
        String response = search("Beatles", SearchType.Playlist);
        System.out.println(response);

        response = getArtistInfo("0OdUWJ0sBjDrqHygGUXeCF");
        System.out.println(response);

        response = getAlbumInfo("0sNOF9WDwhWunNAHPD3Baj");
        System.out.println(response);

        response = getTrackInfo("0eGsygTp906u18L0Oimnem");
        System.out.println(response);

        //TOKEN SHIZZLE
        //response = getTrackFeatures("0eGsygTp906u18L0Oimnem");
        //System.out.println(response);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
