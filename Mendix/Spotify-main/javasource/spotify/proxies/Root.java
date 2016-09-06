// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package spotify.proxies;

public class Root
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Spotify.Root";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Disc_number("Disc_number"),
		Duration_ms("Duration_ms"),
		Explicit("Explicit"),
		Href("Href"),
		_id("_id"),
		Name("Name"),
		Popularity("Popularity"),
		Preview_url("Preview_url"),
		Track_number("Track_number"),
		_type("_type"),
		Uri("Uri"),
		Artists_Root("Spotify.Artists_Root"),
		Albums_Root("Spotify.Albums_Root"),
		Album_Root("Spotify.Album_Root"),
		Available_markets_2_Root("Spotify.Available_markets_2_Root"),
		External_ids_Root("Spotify.External_ids_Root"),
		External_urls_3_Root("Spotify.External_urls_3_Root"),
		Playlists_Root("Spotify.Playlists_Root");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Spotify.Root"));
	}

	protected Root(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject)
	{
		if (rootMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Spotify.Root", rootMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Spotify.Root");

		this.rootMendixObject = rootMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static spotify.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return spotify.proxies.Root.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static spotify.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new spotify.proxies.Root(context, mendixObject);
	}

	public static spotify.proxies.Root load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return spotify.proxies.Root.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Disc_number
	 */
	public final Integer getDisc_number()
	{
		return getDisc_number(getContext());
	}

	/**
	 * @param context
	 * @return value of Disc_number
	 */
	public final Integer getDisc_number(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Disc_number.toString());
	}

	/**
	 * Set value of Disc_number
	 * @param disc_number
	 */
	public final void setDisc_number(Integer disc_number)
	{
		setDisc_number(getContext(), disc_number);
	}

	/**
	 * Set value of Disc_number
	 * @param context
	 * @param disc_number
	 */
	public final void setDisc_number(com.mendix.systemwideinterfaces.core.IContext context, Integer disc_number)
	{
		getMendixObject().setValue(context, MemberNames.Disc_number.toString(), disc_number);
	}

	/**
	 * @return value of Duration_ms
	 */
	public final Integer getDuration_ms()
	{
		return getDuration_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of Duration_ms
	 */
	public final Integer getDuration_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Duration_ms.toString());
	}

	/**
	 * Set value of Duration_ms
	 * @param duration_ms
	 */
	public final void setDuration_ms(Integer duration_ms)
	{
		setDuration_ms(getContext(), duration_ms);
	}

	/**
	 * Set value of Duration_ms
	 * @param context
	 * @param duration_ms
	 */
	public final void setDuration_ms(com.mendix.systemwideinterfaces.core.IContext context, Integer duration_ms)
	{
		getMendixObject().setValue(context, MemberNames.Duration_ms.toString(), duration_ms);
	}

	/**
	 * @return value of Explicit
	 */
	public final Boolean getExplicit()
	{
		return getExplicit(getContext());
	}

	/**
	 * @param context
	 * @return value of Explicit
	 */
	public final Boolean getExplicit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Explicit.toString());
	}

	/**
	 * Set value of Explicit
	 * @param explicit
	 */
	public final void setExplicit(Boolean explicit)
	{
		setExplicit(getContext(), explicit);
	}

	/**
	 * Set value of Explicit
	 * @param context
	 * @param explicit
	 */
	public final void setExplicit(com.mendix.systemwideinterfaces.core.IContext context, Boolean explicit)
	{
		getMendixObject().setValue(context, MemberNames.Explicit.toString(), explicit);
	}

	/**
	 * @return value of Href
	 */
	public final String getHref()
	{
		return getHref(getContext());
	}

	/**
	 * @param context
	 * @return value of Href
	 */
	public final String getHref(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Href.toString());
	}

	/**
	 * Set value of Href
	 * @param href
	 */
	public final void setHref(String href)
	{
		setHref(getContext(), href);
	}

	/**
	 * Set value of Href
	 * @param context
	 * @param href
	 */
	public final void setHref(com.mendix.systemwideinterfaces.core.IContext context, String href)
	{
		getMendixObject().setValue(context, MemberNames.Href.toString(), href);
	}

	/**
	 * @return value of _id
	 */
	public final String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Popularity
	 */
	public final Integer getPopularity()
	{
		return getPopularity(getContext());
	}

	/**
	 * @param context
	 * @return value of Popularity
	 */
	public final Integer getPopularity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Popularity.toString());
	}

	/**
	 * Set value of Popularity
	 * @param popularity
	 */
	public final void setPopularity(Integer popularity)
	{
		setPopularity(getContext(), popularity);
	}

	/**
	 * Set value of Popularity
	 * @param context
	 * @param popularity
	 */
	public final void setPopularity(com.mendix.systemwideinterfaces.core.IContext context, Integer popularity)
	{
		getMendixObject().setValue(context, MemberNames.Popularity.toString(), popularity);
	}

	/**
	 * @return value of Preview_url
	 */
	public final String getPreview_url()
	{
		return getPreview_url(getContext());
	}

	/**
	 * @param context
	 * @return value of Preview_url
	 */
	public final String getPreview_url(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Preview_url.toString());
	}

	/**
	 * Set value of Preview_url
	 * @param preview_url
	 */
	public final void setPreview_url(String preview_url)
	{
		setPreview_url(getContext(), preview_url);
	}

	/**
	 * Set value of Preview_url
	 * @param context
	 * @param preview_url
	 */
	public final void setPreview_url(com.mendix.systemwideinterfaces.core.IContext context, String preview_url)
	{
		getMendixObject().setValue(context, MemberNames.Preview_url.toString(), preview_url);
	}

	/**
	 * @return value of Track_number
	 */
	public final Integer getTrack_number()
	{
		return getTrack_number(getContext());
	}

	/**
	 * @param context
	 * @return value of Track_number
	 */
	public final Integer getTrack_number(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Track_number.toString());
	}

	/**
	 * Set value of Track_number
	 * @param track_number
	 */
	public final void setTrack_number(Integer track_number)
	{
		setTrack_number(getContext(), track_number);
	}

	/**
	 * Set value of Track_number
	 * @param context
	 * @param track_number
	 */
	public final void setTrack_number(com.mendix.systemwideinterfaces.core.IContext context, Integer track_number)
	{
		getMendixObject().setValue(context, MemberNames.Track_number.toString(), track_number);
	}

	/**
	 * @return value of _type
	 */
	public final String get_type()
	{
		return get_type(getContext());
	}

	/**
	 * @param context
	 * @return value of _type
	 */
	public final String get_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames._type.toString());
	}

	/**
	 * Set value of _type
	 * @param _type
	 */
	public final void set_type(String _type)
	{
		set_type(getContext(), _type);
	}

	/**
	 * Set value of _type
	 * @param context
	 * @param _type
	 */
	public final void set_type(com.mendix.systemwideinterfaces.core.IContext context, String _type)
	{
		getMendixObject().setValue(context, MemberNames._type.toString(), _type);
	}

	/**
	 * @return value of Uri
	 */
	public final String getUri()
	{
		return getUri(getContext());
	}

	/**
	 * @param context
	 * @return value of Uri
	 */
	public final String getUri(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Uri.toString());
	}

	/**
	 * Set value of Uri
	 * @param uri
	 */
	public final void setUri(String uri)
	{
		setUri(getContext(), uri);
	}

	/**
	 * Set value of Uri
	 * @param context
	 * @param uri
	 */
	public final void setUri(com.mendix.systemwideinterfaces.core.IContext context, String uri)
	{
		getMendixObject().setValue(context, MemberNames.Uri.toString(), uri);
	}

	/**
	 * @return value of Artists_Root
	 */
	public final spotify.proxies.Artists getArtists_Root() throws com.mendix.core.CoreException
	{
		return getArtists_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Artists_Root
	 */
	public final spotify.proxies.Artists getArtists_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Artists result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Artists_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Artists.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Artists_Root
	 * @param artists_root
	 */
	public final void setArtists_Root(spotify.proxies.Artists artists_root)
	{
		setArtists_Root(getContext(), artists_root);
	}

	/**
	 * Set value of Artists_Root
	 * @param context
	 * @param artists_root
	 */
	public final void setArtists_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Artists artists_root)
	{
		if (artists_root == null)
			getMendixObject().setValue(context, MemberNames.Artists_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Artists_Root.toString(), artists_root.getMendixObject().getId());
	}

	/**
	 * @return value of Albums_Root
	 */
	public final spotify.proxies.Albums getAlbums_Root() throws com.mendix.core.CoreException
	{
		return getAlbums_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Albums_Root
	 */
	public final spotify.proxies.Albums getAlbums_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Albums result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Albums_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Albums.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Albums_Root
	 * @param albums_root
	 */
	public final void setAlbums_Root(spotify.proxies.Albums albums_root)
	{
		setAlbums_Root(getContext(), albums_root);
	}

	/**
	 * Set value of Albums_Root
	 * @param context
	 * @param albums_root
	 */
	public final void setAlbums_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Albums albums_root)
	{
		if (albums_root == null)
			getMendixObject().setValue(context, MemberNames.Albums_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Albums_Root.toString(), albums_root.getMendixObject().getId());
	}

	/**
	 * @return value of Album_Root
	 */
	public final spotify.proxies.Album getAlbum_Root() throws com.mendix.core.CoreException
	{
		return getAlbum_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Album_Root
	 */
	public final spotify.proxies.Album getAlbum_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Album result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Album_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Album.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Album_Root
	 * @param album_root
	 */
	public final void setAlbum_Root(spotify.proxies.Album album_root)
	{
		setAlbum_Root(getContext(), album_root);
	}

	/**
	 * Set value of Album_Root
	 * @param context
	 * @param album_root
	 */
	public final void setAlbum_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Album album_root)
	{
		if (album_root == null)
			getMendixObject().setValue(context, MemberNames.Album_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Album_Root.toString(), album_root.getMendixObject().getId());
	}

	/**
	 * @return value of Available_markets_2_Root
	 */
	public final spotify.proxies.Available_markets_2 getAvailable_markets_2_Root() throws com.mendix.core.CoreException
	{
		return getAvailable_markets_2_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Available_markets_2_Root
	 */
	public final spotify.proxies.Available_markets_2 getAvailable_markets_2_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Available_markets_2 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Available_markets_2_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Available_markets_2.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Available_markets_2_Root
	 * @param available_markets_2_root
	 */
	public final void setAvailable_markets_2_Root(spotify.proxies.Available_markets_2 available_markets_2_root)
	{
		setAvailable_markets_2_Root(getContext(), available_markets_2_root);
	}

	/**
	 * Set value of Available_markets_2_Root
	 * @param context
	 * @param available_markets_2_root
	 */
	public final void setAvailable_markets_2_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Available_markets_2 available_markets_2_root)
	{
		if (available_markets_2_root == null)
			getMendixObject().setValue(context, MemberNames.Available_markets_2_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Available_markets_2_Root.toString(), available_markets_2_root.getMendixObject().getId());
	}

	/**
	 * @return value of External_ids_Root
	 */
	public final spotify.proxies.External_ids getExternal_ids_Root() throws com.mendix.core.CoreException
	{
		return getExternal_ids_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of External_ids_Root
	 */
	public final spotify.proxies.External_ids getExternal_ids_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.External_ids result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.External_ids_Root.toString());
		if (identifier != null)
			result = spotify.proxies.External_ids.load(context, identifier);
		return result;
	}

	/**
	 * Set value of External_ids_Root
	 * @param external_ids_root
	 */
	public final void setExternal_ids_Root(spotify.proxies.External_ids external_ids_root)
	{
		setExternal_ids_Root(getContext(), external_ids_root);
	}

	/**
	 * Set value of External_ids_Root
	 * @param context
	 * @param external_ids_root
	 */
	public final void setExternal_ids_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.External_ids external_ids_root)
	{
		if (external_ids_root == null)
			getMendixObject().setValue(context, MemberNames.External_ids_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.External_ids_Root.toString(), external_ids_root.getMendixObject().getId());
	}

	/**
	 * @return value of External_urls_3_Root
	 */
	public final spotify.proxies.External_urls_3 getExternal_urls_3_Root() throws com.mendix.core.CoreException
	{
		return getExternal_urls_3_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of External_urls_3_Root
	 */
	public final spotify.proxies.External_urls_3 getExternal_urls_3_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.External_urls_3 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.External_urls_3_Root.toString());
		if (identifier != null)
			result = spotify.proxies.External_urls_3.load(context, identifier);
		return result;
	}

	/**
	 * Set value of External_urls_3_Root
	 * @param external_urls_3_root
	 */
	public final void setExternal_urls_3_Root(spotify.proxies.External_urls_3 external_urls_3_root)
	{
		setExternal_urls_3_Root(getContext(), external_urls_3_root);
	}

	/**
	 * Set value of External_urls_3_Root
	 * @param context
	 * @param external_urls_3_root
	 */
	public final void setExternal_urls_3_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.External_urls_3 external_urls_3_root)
	{
		if (external_urls_3_root == null)
			getMendixObject().setValue(context, MemberNames.External_urls_3_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.External_urls_3_Root.toString(), external_urls_3_root.getMendixObject().getId());
	}

	/**
	 * @return value of Playlists_Root
	 */
	public final spotify.proxies.Playlists getPlaylists_Root() throws com.mendix.core.CoreException
	{
		return getPlaylists_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Playlists_Root
	 */
	public final spotify.proxies.Playlists getPlaylists_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Playlists result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Playlists_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Playlists.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Playlists_Root
	 * @param playlists_root
	 */
	public final void setPlaylists_Root(spotify.proxies.Playlists playlists_root)
	{
		setPlaylists_Root(getContext(), playlists_root);
	}

	/**
	 * Set value of Playlists_Root
	 * @param context
	 * @param playlists_root
	 */
	public final void setPlaylists_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Playlists playlists_root)
	{
		if (playlists_root == null)
			getMendixObject().setValue(context, MemberNames.Playlists_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Playlists_Root.toString(), playlists_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rootMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final spotify.proxies.Root that = (spotify.proxies.Root) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Spotify.Root";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}