// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package task.proxies;

public class Planned_transactions
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject planned_transactionsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Task.Planned_transactions";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Date("Date"),
		ID_OF_DAY("ID_OF_DAY"),
		Debtor("Debtor"),
		Lender("Lender"),
		Amount("Amount"),
		Purpose("Purpose"),
		Is_payed("Is_payed");

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

	public Planned_transactions(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Task.Planned_transactions"));
	}

	protected Planned_transactions(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject planned_transactionsMendixObject)
	{
		if (planned_transactionsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Task.Planned_transactions", planned_transactionsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Task.Planned_transactions");

		this.planned_transactionsMendixObject = planned_transactionsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Planned_transactions.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static task.proxies.Planned_transactions initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return task.proxies.Planned_transactions.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static task.proxies.Planned_transactions initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new task.proxies.Planned_transactions(context, mendixObject);
	}

	public static task.proxies.Planned_transactions load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return task.proxies.Planned_transactions.initialize(context, mendixObject);
	}

	public static java.util.List<task.proxies.Planned_transactions> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<task.proxies.Planned_transactions> result = new java.util.ArrayList<task.proxies.Planned_transactions>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Task.Planned_transactions" + xpathConstraint))
			result.add(task.proxies.Planned_transactions.initialize(context, obj));
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
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of ID_OF_DAY
	 */
	public final java.lang.String getID_OF_DAY()
	{
		return getID_OF_DAY(getContext());
	}

	/**
	 * @param context
	 * @return value of ID_OF_DAY
	 */
	public final java.lang.String getID_OF_DAY(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ID_OF_DAY.toString());
	}

	/**
	 * Set value of ID_OF_DAY
	 * @param id_of_day
	 */
	public final void setID_OF_DAY(java.lang.String id_of_day)
	{
		setID_OF_DAY(getContext(), id_of_day);
	}

	/**
	 * Set value of ID_OF_DAY
	 * @param context
	 * @param id_of_day
	 */
	public final void setID_OF_DAY(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String id_of_day)
	{
		getMendixObject().setValue(context, MemberNames.ID_OF_DAY.toString(), id_of_day);
	}

	/**
	 * @return value of Debtor
	 */
	public final java.lang.String getDebtor()
	{
		return getDebtor(getContext());
	}

	/**
	 * @param context
	 * @return value of Debtor
	 */
	public final java.lang.String getDebtor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Debtor.toString());
	}

	/**
	 * Set value of Debtor
	 * @param debtor
	 */
	public final void setDebtor(java.lang.String debtor)
	{
		setDebtor(getContext(), debtor);
	}

	/**
	 * Set value of Debtor
	 * @param context
	 * @param debtor
	 */
	public final void setDebtor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String debtor)
	{
		getMendixObject().setValue(context, MemberNames.Debtor.toString(), debtor);
	}

	/**
	 * @return value of Lender
	 */
	public final java.lang.String getLender()
	{
		return getLender(getContext());
	}

	/**
	 * @param context
	 * @return value of Lender
	 */
	public final java.lang.String getLender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Lender.toString());
	}

	/**
	 * Set value of Lender
	 * @param lender
	 */
	public final void setLender(java.lang.String lender)
	{
		setLender(getContext(), lender);
	}

	/**
	 * Set value of Lender
	 * @param context
	 * @param lender
	 */
	public final void setLender(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lender)
	{
		getMendixObject().setValue(context, MemberNames.Lender.toString(), lender);
	}

	/**
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Purpose
	 */
	public final java.lang.String getPurpose()
	{
		return getPurpose(getContext());
	}

	/**
	 * @param context
	 * @return value of Purpose
	 */
	public final java.lang.String getPurpose(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Purpose.toString());
	}

	/**
	 * Set value of Purpose
	 * @param purpose
	 */
	public final void setPurpose(java.lang.String purpose)
	{
		setPurpose(getContext(), purpose);
	}

	/**
	 * Set value of Purpose
	 * @param context
	 * @param purpose
	 */
	public final void setPurpose(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String purpose)
	{
		getMendixObject().setValue(context, MemberNames.Purpose.toString(), purpose);
	}

	/**
	 * @return value of Is_payed
	 */
	public final java.lang.Boolean getIs_payed()
	{
		return getIs_payed(getContext());
	}

	/**
	 * @param context
	 * @return value of Is_payed
	 */
	public final java.lang.Boolean getIs_payed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Is_payed.toString());
	}

	/**
	 * Set value of Is_payed
	 * @param is_payed
	 */
	public final void setIs_payed(java.lang.Boolean is_payed)
	{
		setIs_payed(getContext(), is_payed);
	}

	/**
	 * Set value of Is_payed
	 * @param context
	 * @param is_payed
	 */
	public final void setIs_payed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean is_payed)
	{
		getMendixObject().setValue(context, MemberNames.Is_payed.toString(), is_payed);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return planned_transactionsMendixObject;
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
			final task.proxies.Planned_transactions that = (task.proxies.Planned_transactions) obj;
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
		return "Task.Planned_transactions";
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