// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package spotify.proxies;

public class External_ids
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject external_idsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Spotify.External_ids";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Isrc("Isrc"),
		External_ids_Root("Spotify.External_ids_Root");

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

	public External_ids(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Spotify.External_ids"));
	}

	protected External_ids(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject external_idsMendixObject)
	{
		if (external_idsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Spotify.External_ids", external_idsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Spotify.External_ids");

		this.external_idsMendixObject = external_idsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'External_ids.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static spotify.proxies.External_ids initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return spotify.proxies.External_ids.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static spotify.proxies.External_ids initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new spotify.proxies.External_ids(context, mendixObject);
	}

	public static spotify.proxies.External_ids load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return spotify.proxies.External_ids.initialize(context, mendixObject);
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
	 * @return value of Isrc
	 */
	public final String getIsrc()
	{
		return getIsrc(getContext());
	}

	/**
	 * @param context
	 * @return value of Isrc
	 */
	public final String getIsrc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Isrc.toString());
	}

	/**
	 * Set value of Isrc
	 * @param isrc
	 */
	public final void setIsrc(String isrc)
	{
		setIsrc(getContext(), isrc);
	}

	/**
	 * Set value of Isrc
	 * @param context
	 * @param isrc
	 */
	public final void setIsrc(com.mendix.systemwideinterfaces.core.IContext context, String isrc)
	{
		getMendixObject().setValue(context, MemberNames.Isrc.toString(), isrc);
	}

	/**
	 * @return value of External_ids_Root
	 */
	public final spotify.proxies.Root getExternal_ids_Root() throws com.mendix.core.CoreException
	{
		return getExternal_ids_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of External_ids_Root
	 */
	public final spotify.proxies.Root getExternal_ids_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		spotify.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.External_ids_Root.toString());
		if (identifier != null)
			result = spotify.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of External_ids_Root
	 * @param external_ids_root
	 */
	public final void setExternal_ids_Root(spotify.proxies.Root external_ids_root)
	{
		setExternal_ids_Root(getContext(), external_ids_root);
	}

	/**
	 * Set value of External_ids_Root
	 * @param context
	 * @param external_ids_root
	 */
	public final void setExternal_ids_Root(com.mendix.systemwideinterfaces.core.IContext context, spotify.proxies.Root external_ids_root)
	{
		if (external_ids_root == null)
			getMendixObject().setValue(context, MemberNames.External_ids_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.External_ids_Root.toString(), external_ids_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return external_idsMendixObject;
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
			final spotify.proxies.External_ids that = (spotify.proxies.External_ids) obj;
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
		return "Spotify.External_ids";
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