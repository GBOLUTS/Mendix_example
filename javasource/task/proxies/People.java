// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package task.proxies;

public class People
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject peopleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Task.People";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		phone("phone"),
		E_Mail("E_Mail");

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

	public People(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Task.People"));
	}

	protected People(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject peopleMendixObject)
	{
		if (peopleMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Task.People", peopleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Task.People");

		this.peopleMendixObject = peopleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'People.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static task.proxies.People initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return task.proxies.People.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static task.proxies.People initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new task.proxies.People(context, mendixObject);
	}

	public static task.proxies.People load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return task.proxies.People.initialize(context, mendixObject);
	}

	public static java.util.List<task.proxies.People> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<task.proxies.People> result = new java.util.ArrayList<task.proxies.People>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Task.People" + xpathConstraint))
			result.add(task.proxies.People.initialize(context, obj));
		return result;
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of phone
	 */
	public final java.lang.String getphone()
	{
		return getphone(getContext());
	}

	/**
	 * @param context
	 * @return value of phone
	 */
	public final java.lang.String getphone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.phone.toString());
	}

	/**
	 * Set value of phone
	 * @param phone
	 */
	public final void setphone(java.lang.String phone)
	{
		setphone(getContext(), phone);
	}

	/**
	 * Set value of phone
	 * @param context
	 * @param phone
	 */
	public final void setphone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phone)
	{
		getMendixObject().setValue(context, MemberNames.phone.toString(), phone);
	}

	/**
	 * @return value of E_Mail
	 */
	public final java.lang.String getE_Mail()
	{
		return getE_Mail(getContext());
	}

	/**
	 * @param context
	 * @return value of E_Mail
	 */
	public final java.lang.String getE_Mail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.E_Mail.toString());
	}

	/**
	 * Set value of E_Mail
	 * @param e_mail
	 */
	public final void setE_Mail(java.lang.String e_mail)
	{
		setE_Mail(getContext(), e_mail);
	}

	/**
	 * Set value of E_Mail
	 * @param context
	 * @param e_mail
	 */
	public final void setE_Mail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String e_mail)
	{
		getMendixObject().setValue(context, MemberNames.E_Mail.toString(), e_mail);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return peopleMendixObject;
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
			final task.proxies.People that = (task.proxies.People) obj;
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
		return "Task.People";
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