// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package spotify.proxies;

public class Artists
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject artistsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Spotify.Artists";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Href("Href"),
		Limit("Limit"),
		Next("Next"),
		Offset("Offset"),
		Previous("Previous"),
		Total("Total"),
		Artists_Root("Spotify.Artists_Root"),
		Items_Artists("Spotify.Items_Artists");

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

	public Artists(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Spotify.Artists"));
	}

	protected Artists(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject artistsMendixObject)
	{
		if (artistsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Spotify.Artists", artistsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Spotify.Artists");

		this.artistsMendixObject = artistsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Artists.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static spotify.proxies.Artists initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return spotify.proxies.Artists.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static spotify.proxies.Artists initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new spotify.proxies.Artists(context, mendixObject);
	}

	public static spotify.proxies.Artists load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return spotify.proxies.Artists.initialize(context, mendixObject);
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
	 * @return value of Limit
	 */
	public final Integer getLimit()
	{
		return getLimit(getContext());
	}

	/**
	 * @param context
	 * @return value of Limit
	 */
	public final Integer getLimit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Limit.toString());
	}

	/**
	 * Set value of Limit
	 * @param limit
	 */
	public final void setLimit(Integer limit)
	{
		setLimit(getContext(), limit);
	}

	/**
	 * Set value of Limit
	 * @param context
	 * @param limit
	 */
	public final void setLimit(com.mendix.systemwideinterfaces.core.IContext context, Integer limit)
	{
		getMendixObject().setValue(context, MemberNames.Limit.toString(), limit);
	}

	/**
	 * @return value of Next
	 */
	public final String getNext()
	{
		return getNext(getContext());
	}

	/**
	 * @param context
	 * @return value of Next
	 */
	public final String getNext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Next.toString());
	}

	/**
	 * Set value of Next
	 * @param next
	 */
	public final void setNext(String next)
	{
		setNext(getContext(), next);
	}

	/**
	 * Set value of Next
	 * @param context
	 * @param next
	 */
	public final void setNext(com.mendix.systemwideinterfaces.core.IContext context, String next)
	{
		getMendixObject().setValue(context, MemberNames.Next.toString(), next);
	}

	/**
	 * @return value of Offset
	 */
	public final Integer getOffset()
	{
		return getOffset(getContext());
	}

	/**
	 * @param context
	 * @return value of Offset
	 */
	public final Integer getOffset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Offset.toString());
	}

	/**
	 * Set value of Offset
	 * @param offset
	 */
	public final void setOffset(Integer offset)
	{
		setOffset(getContext(), offset);
	}

	/**
	 * Set value of Offset
	 * @param context
	 * @param offset
	 */
	public final void setOffset(com.mendix.systemwideinterfaces.core.IContext context, Integer offset)
	{
		getMendixObject().setValue(context, MemberNames.Offset.toString(), offset);
	}

	/**
	 * @return value of Previous
	 */
	public final String getPrevious()
	{
		return getPrevious(getContext());
	}

	/**
	 * @param context
	 * @return value of Previous
	 */
	public final String getPrevious(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Previous.toString());
	}

	/**
	 * Set value of Previous
	 * @param previous
	 */
	public final void setPrevious(String previous)
	{
		setPrevious(getContext(), previous);
	}

	/**
	 * Set value of Previous
	 * @param context
	 * @param previous
	 */
	public final void setPrevious(com.mendix.systemwideinterfaces.core.IContext context, String previous)
	{
		getMendixObject().setValue(context, MemberNames.Previous.toString(), previous);
	}

	/**
	 * @return value of Total
	 */
	public final Integer getTotal()
	{
		return getTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of Total
	 */
	public final Integer getTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Total.toString());
	}

	/**
	 * Set value of Total
	 * @param total
	 */
	public final void setTotal(Integer total)
	{
		setTotal(getContext(), total);
	}

	/**
	 * Set value of Total
	 * @param context
	 * @param total
	 */
	public final void setTotal(com.mendix.systemwideinterfaces.core.IContext context, Integer total)
	{
		getMendixObject().setValue(context, MemberNames.Total.toString(), total);
	}

	/**
	 * @return value of Artists_Root
	 */
	public final spotify.proxies.Root getArtists_Root() throws com.mendix.core.CoreException
	{
		return getArtists_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Artists_Root
	 */
	public final spotify.proxies.Root getArtists_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Artists_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Artists_Root
	 * @param artists_root
	 */
	public final void setArtists_Root(spotify.proxies.Root artists_root)
	{
		setArtists_Root(getContext(), artists_root);
	}

	/**
	 * Set value of Artists_Root
	 * @param context
	 * @param artists_root
	 */
	public final void setArtists_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Root artists_root)
	{
		if (artists_root == null)
			getMendixObject().setValue(context, MemberNames.Artists_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Artists_Root.toString(), artists_root.getMendixObject().getId());
	}

	/**
	 * @return value of Items_Artists
	 */
	public final spotify.proxies.Items getItems_Artists() throws com.mendix.core.CoreException
	{
		return getItems_Artists(getContext());
	}

	/**
	 * @param context
	 * @return value of Items_Artists
	 */
	public final spotify.proxies.Items getItems_Artists(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Items result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Items_Artists.toString());
		if (identifier != null)
			result = spotify.proxies.Items.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Items_Artists
	 * @param items_artists
	 */
	public final void setItems_Artists(spotify.proxies.Items items_artists)
	{
		setItems_Artists(getContext(), items_artists);
	}

	/**
	 * Set value of Items_Artists
	 * @param context
	 * @param items_artists
	 */
	public final void setItems_Artists(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Items items_artists)
	{
		if (items_artists == null)
			getMendixObject().setValue(context, MemberNames.Items_Artists.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Items_Artists.toString(), items_artists.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return artistsMendixObject;
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
			final spotify.proxies.Artists that = (spotify.proxies.Artists) obj;
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
		return "Spotify.Artists";
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