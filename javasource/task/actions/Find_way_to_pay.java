// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package task.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Find_way_to_pay extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.List<IMendixObject> __Parameter;
	private java.util.List<task.proxies.All_information> Parameter;

	public Find_way_to_pay(IContext context, java.util.List<IMendixObject> Parameter)
	{
		super(context);
		this.__Parameter = Parameter;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.Parameter = new java.util.ArrayList<task.proxies.All_information>();
		if (__Parameter != null)
			for (IMendixObject __ParameterElement : __Parameter)
				this.Parameter.add(task.proxies.All_information.initialize(getContext(), __ParameterElement));

		// BEGIN USER CODE

		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Find_way_to_pay";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
