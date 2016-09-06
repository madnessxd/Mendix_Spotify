// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package spotify.proxies;

public class JsonObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject jsonObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Spotify.JsonObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Href("Href"),
		_id("_id"),
		Name("Name"),
		Popularity("Popularity"),
		_type("_type"),
		Uri("Uri"),
		Album_type("Album_type"),
		Height("Height"),
		Url("Url"),
		Width("Width"),
		Collaborative("Collaborative"),
		_public("_public"),
		Snapshot_id("Snapshot_id"),
		JsonObject_Items("Spotify.JsonObject_Items"),
		External_urls_JsonObject("Spotify.External_urls_JsonObject"),
		Followers_JsonObject("Spotify.Followers_JsonObject"),
		Genres_JsonObject("Spotify.Genres_JsonObject"),
		Images_JsonObject("Spotify.Images_JsonObject"),
		Available_markets_JsonObject("Spotify.Available_markets_JsonObject"),
		JsonObject_Images("Spotify.JsonObject_Images"),
		_owner_JsonObject("Spotify._owner_JsonObject"),
		Tracks_JsonObject("Spotify.Tracks_JsonObject");

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

	public JsonObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Spotify.JsonObject"));
	}

	protected JsonObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject jsonObjectMendixObject)
	{
		if (jsonObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Spotify.JsonObject", jsonObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Spotify.JsonObject");

		this.jsonObjectMendixObject = jsonObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'JsonObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static spotify.proxies.JsonObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return spotify.proxies.JsonObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static spotify.proxies.JsonObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new spotify.proxies.JsonObject(context, mendixObject);
	}

	public static spotify.proxies.JsonObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return spotify.proxies.JsonObject.initialize(context, mendixObject);
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
	 * @return value of Album_type
	 */
	public final String getAlbum_type()
	{
		return getAlbum_type(getContext());
	}

	/**
	 * @param context
	 * @return value of Album_type
	 */
	public final String getAlbum_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Album_type.toString());
	}

	/**
	 * Set value of Album_type
	 * @param album_type
	 */
	public final void setAlbum_type(String album_type)
	{
		setAlbum_type(getContext(), album_type);
	}

	/**
	 * Set value of Album_type
	 * @param context
	 * @param album_type
	 */
	public final void setAlbum_type(com.mendix.systemwideinterfaces.core.IContext context, String album_type)
	{
		getMendixObject().setValue(context, MemberNames.Album_type.toString(), album_type);
	}

	/**
	 * @return value of Height
	 */
	public final Integer getHeight()
	{
		return getHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of Height
	 */
	public final Integer getHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Height.toString());
	}

	/**
	 * Set value of Height
	 * @param height
	 */
	public final void setHeight(Integer height)
	{
		setHeight(getContext(), height);
	}

	/**
	 * Set value of Height
	 * @param context
	 * @param height
	 */
	public final void setHeight(com.mendix.systemwideinterfaces.core.IContext context, Integer height)
	{
		getMendixObject().setValue(context, MemberNames.Height.toString(), height);
	}

	/**
	 * @return value of Url
	 */
	public final String getUrl()
	{
		return getUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of Url
	 */
	public final String getUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Url.toString());
	}

	/**
	 * Set value of Url
	 * @param url
	 */
	public final void setUrl(String url)
	{
		setUrl(getContext(), url);
	}

	/**
	 * Set value of Url
	 * @param context
	 * @param url
	 */
	public final void setUrl(com.mendix.systemwideinterfaces.core.IContext context, String url)
	{
		getMendixObject().setValue(context, MemberNames.Url.toString(), url);
	}

	/**
	 * @return value of Width
	 */
	public final Integer getWidth()
	{
		return getWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of Width
	 */
	public final Integer getWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Width.toString());
	}

	/**
	 * Set value of Width
	 * @param width
	 */
	public final void setWidth(Integer width)
	{
		setWidth(getContext(), width);
	}

	/**
	 * Set value of Width
	 * @param context
	 * @param width
	 */
	public final void setWidth(com.mendix.systemwideinterfaces.core.IContext context, Integer width)
	{
		getMendixObject().setValue(context, MemberNames.Width.toString(), width);
	}

	/**
	 * @return value of Collaborative
	 */
	public final Boolean getCollaborative()
	{
		return getCollaborative(getContext());
	}

	/**
	 * @param context
	 * @return value of Collaborative
	 */
	public final Boolean getCollaborative(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Collaborative.toString());
	}

	/**
	 * Set value of Collaborative
	 * @param collaborative
	 */
	public final void setCollaborative(Boolean collaborative)
	{
		setCollaborative(getContext(), collaborative);
	}

	/**
	 * Set value of Collaborative
	 * @param context
	 * @param collaborative
	 */
	public final void setCollaborative(com.mendix.systemwideinterfaces.core.IContext context, Boolean collaborative)
	{
		getMendixObject().setValue(context, MemberNames.Collaborative.toString(), collaborative);
	}

	/**
	 * @return value of _public
	 */
	public final String get_public()
	{
		return get_public(getContext());
	}

	/**
	 * @param context
	 * @return value of _public
	 */
	public final String get_public(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames._public.toString());
	}

	/**
	 * Set value of _public
	 * @param _public
	 */
	public final void set_public(String _public)
	{
		set_public(getContext(), _public);
	}

	/**
	 * Set value of _public
	 * @param context
	 * @param _public
	 */
	public final void set_public(com.mendix.systemwideinterfaces.core.IContext context, String _public)
	{
		getMendixObject().setValue(context, MemberNames._public.toString(), _public);
	}

	/**
	 * @return value of Snapshot_id
	 */
	public final String getSnapshot_id()
	{
		return getSnapshot_id(getContext());
	}

	/**
	 * @param context
	 * @return value of Snapshot_id
	 */
	public final String getSnapshot_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Snapshot_id.toString());
	}

	/**
	 * Set value of Snapshot_id
	 * @param snapshot_id
	 */
	public final void setSnapshot_id(String snapshot_id)
	{
		setSnapshot_id(getContext(), snapshot_id);
	}

	/**
	 * Set value of Snapshot_id
	 * @param context
	 * @param snapshot_id
	 */
	public final void setSnapshot_id(com.mendix.systemwideinterfaces.core.IContext context, String snapshot_id)
	{
		getMendixObject().setValue(context, MemberNames.Snapshot_id.toString(), snapshot_id);
	}

	/**
	 * @return value of JsonObject_Items
	 */
	public final spotify.proxies.Items getJsonObject_Items() throws com.mendix.core.CoreException
	{
		return getJsonObject_Items(getContext());
	}

	/**
	 * @param context
	 * @return value of JsonObject_Items
	 */
	public final spotify.proxies.Items getJsonObject_Items(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Items result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.JsonObject_Items.toString());
		if (identifier != null)
			result = spotify.proxies.Items.load(context, identifier);
		return result;
	}

	/**
	 * Set value of JsonObject_Items
	 * @param jsonobject_items
	 */
	public final void setJsonObject_Items(spotify.proxies.Items jsonobject_items)
	{
		setJsonObject_Items(getContext(), jsonobject_items);
	}

	/**
	 * Set value of JsonObject_Items
	 * @param context
	 * @param jsonobject_items
	 */
	public final void setJsonObject_Items(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Items jsonobject_items)
	{
		if (jsonobject_items == null)
			getMendixObject().setValue(context, MemberNames.JsonObject_Items.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.JsonObject_Items.toString(), jsonobject_items.getMendixObject().getId());
	}

	/**
	 * @return value of External_urls_JsonObject
	 */
	public final spotify.proxies.External_urls getExternal_urls_JsonObject() throws com.mendix.core.CoreException
	{
		return getExternal_urls_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of External_urls_JsonObject
	 */
	public final spotify.proxies.External_urls getExternal_urls_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.External_urls result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.External_urls_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies.External_urls.load(context, identifier);
		return result;
	}

	/**
	 * Set value of External_urls_JsonObject
	 * @param external_urls_jsonobject
	 */
	public final void setExternal_urls_JsonObject(spotify.proxies.External_urls external_urls_jsonobject)
	{
		setExternal_urls_JsonObject(getContext(), external_urls_jsonobject);
	}

	/**
	 * Set value of External_urls_JsonObject
	 * @param context
	 * @param external_urls_jsonobject
	 */
	public final void setExternal_urls_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.External_urls external_urls_jsonobject)
	{
		if (external_urls_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.External_urls_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.External_urls_JsonObject.toString(), external_urls_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return value of Followers_JsonObject
	 */
	public final spotify.proxies.Followers getFollowers_JsonObject() throws com.mendix.core.CoreException
	{
		return getFollowers_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Followers_JsonObject
	 */
	public final spotify.proxies.Followers getFollowers_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Followers result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Followers_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies.Followers.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Followers_JsonObject
	 * @param followers_jsonobject
	 */
	public final void setFollowers_JsonObject(spotify.proxies.Followers followers_jsonobject)
	{
		setFollowers_JsonObject(getContext(), followers_jsonobject);
	}

	/**
	 * Set value of Followers_JsonObject
	 * @param context
	 * @param followers_jsonobject
	 */
	public final void setFollowers_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Followers followers_jsonobject)
	{
		if (followers_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.Followers_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Followers_JsonObject.toString(), followers_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return value of Genres_JsonObject
	 */
	public final spotify.proxies.Genres getGenres_JsonObject() throws com.mendix.core.CoreException
	{
		return getGenres_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Genres_JsonObject
	 */
	public final spotify.proxies.Genres getGenres_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Genres result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Genres_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies.Genres.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Genres_JsonObject
	 * @param genres_jsonobject
	 */
	public final void setGenres_JsonObject(spotify.proxies.Genres genres_jsonobject)
	{
		setGenres_JsonObject(getContext(), genres_jsonobject);
	}

	/**
	 * Set value of Genres_JsonObject
	 * @param context
	 * @param genres_jsonobject
	 */
	public final void setGenres_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Genres genres_jsonobject)
	{
		if (genres_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.Genres_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Genres_JsonObject.toString(), genres_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return value of Images_JsonObject
	 */
	public final spotify.proxies.Images getImages_JsonObject() throws com.mendix.core.CoreException
	{
		return getImages_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Images_JsonObject
	 */
	public final spotify.proxies.Images getImages_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Images result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Images_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies.Images.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Images_JsonObject
	 * @param images_jsonobject
	 */
	public final void setImages_JsonObject(spotify.proxies.Images images_jsonobject)
	{
		setImages_JsonObject(getContext(), images_jsonobject);
	}

	/**
	 * Set value of Images_JsonObject
	 * @param context
	 * @param images_jsonobject
	 */
	public final void setImages_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Images images_jsonobject)
	{
		if (images_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.Images_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Images_JsonObject.toString(), images_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return value of Available_markets_JsonObject
	 */
	public final spotify.proxies.Available_markets getAvailable_markets_JsonObject() throws com.mendix.core.CoreException
	{
		return getAvailable_markets_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Available_markets_JsonObject
	 */
	public final spotify.proxies.Available_markets getAvailable_markets_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Available_markets result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Available_markets_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies.Available_markets.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Available_markets_JsonObject
	 * @param available_markets_jsonobject
	 */
	public final void setAvailable_markets_JsonObject(spotify.proxies.Available_markets available_markets_jsonobject)
	{
		setAvailable_markets_JsonObject(getContext(), available_markets_jsonobject);
	}

	/**
	 * Set value of Available_markets_JsonObject
	 * @param context
	 * @param available_markets_jsonobject
	 */
	public final void setAvailable_markets_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Available_markets available_markets_jsonobject)
	{
		if (available_markets_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.Available_markets_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Available_markets_JsonObject.toString(), available_markets_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return value of JsonObject_Images
	 */
	public final spotify.proxies.Images getJsonObject_Images() throws com.mendix.core.CoreException
	{
		return getJsonObject_Images(getContext());
	}

	/**
	 * @param context
	 * @return value of JsonObject_Images
	 */
	public final spotify.proxies.Images getJsonObject_Images(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Images result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.JsonObject_Images.toString());
		if (identifier != null)
			result = spotify.proxies.Images.load(context, identifier);
		return result;
	}

	/**
	 * Set value of JsonObject_Images
	 * @param jsonobject_images
	 */
	public final void setJsonObject_Images(spotify.proxies.Images jsonobject_images)
	{
		setJsonObject_Images(getContext(), jsonobject_images);
	}

	/**
	 * Set value of JsonObject_Images
	 * @param context
	 * @param jsonobject_images
	 */
	public final void setJsonObject_Images(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Images jsonobject_images)
	{
		if (jsonobject_images == null)
			getMendixObject().setValue(context, MemberNames.JsonObject_Images.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.JsonObject_Images.toString(), jsonobject_images.getMendixObject().getId());
	}

	/**
	 * @return value of _owner_JsonObject
	 */
	public final spotify.proxies._owner get_owner_JsonObject() throws com.mendix.core.CoreException
	{
		return get_owner_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of _owner_JsonObject
	 */
	public final spotify.proxies._owner get_owner_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies._owner result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames._owner_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies._owner.load(context, identifier);
		return result;
	}

	/**
	 * Set value of _owner_JsonObject
	 * @param _owner_jsonobject
	 */
	public final void set_owner_JsonObject(spotify.proxies._owner _owner_jsonobject)
	{
		set_owner_JsonObject(getContext(), _owner_jsonobject);
	}

	/**
	 * Set value of _owner_JsonObject
	 * @param context
	 * @param _owner_jsonobject
	 */
	public final void set_owner_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies._owner _owner_jsonobject)
	{
		if (_owner_jsonobject == null)
			getMendixObject().setValue(context, MemberNames._owner_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames._owner_JsonObject.toString(), _owner_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return value of Tracks_JsonObject
	 */
	public final spotify.proxies.Tracks getTracks_JsonObject() throws com.mendix.core.CoreException
	{
		return getTracks_JsonObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Tracks_JsonObject
	 */
	public final spotify.proxies.Tracks getTracks_JsonObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Tracks result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tracks_JsonObject.toString());
		if (identifier != null)
			result = spotify.proxies.Tracks.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Tracks_JsonObject
	 * @param tracks_jsonobject
	 */
	public final void setTracks_JsonObject(spotify.proxies.Tracks tracks_jsonobject)
	{
		setTracks_JsonObject(getContext(), tracks_jsonobject);
	}

	/**
	 * Set value of Tracks_JsonObject
	 * @param context
	 * @param tracks_jsonobject
	 */
	public final void setTracks_JsonObject(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Tracks tracks_jsonobject)
	{
		if (tracks_jsonobject == null)
			getMendixObject().setValue(context, MemberNames.Tracks_JsonObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Tracks_JsonObject.toString(), tracks_jsonobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return jsonObjectMendixObject;
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
			final spotify.proxies.JsonObject that = (spotify.proxies.JsonObject) obj;
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
		return "Spotify.JsonObject";
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