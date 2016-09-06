// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package spotify.proxies;

public enum SearchType
{
	Artist(new String[][] { new String[] { "en_US", "artist" } }),
	Album(new String[][] { new String[] { "en_US", "album" } }),
	Playlist(new String[][] { new String[] { "en_US", "playlist" } }),
	Track(new String[][] { new String[] { "en_US", "track" } });

	private java.util.Map<String,String> captions;

	private SearchType(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
