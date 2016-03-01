// template routine Java
package routines;

import java.lang.reflect.*;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */
public class PopulateFromDynamic {

	public static boolean debug = false;

	/**
	 * populate: populate a defined output schema from a dynamic input schema
	 * and a reference schema that tells us the order in which the columns will
	 * be found.
	 * 
	 * 
	 * {talendTypes} Object
	 * 
	 * {Category} User Defined
	 * 
	 * {param} Object(input_row) input: the input_row object to populate values
	 * from. {param} Object(output_row) input: the output_row object to populate
	 * the values in. {param} Object(reference_row) input: the reference row
	 * that provides us with the order of the schemas. {param}
	 * Object(populated_output_row) output: the now populated output_row object.
	 * NOTE: the reference_row MUST HAVE the same schema as the input_row.
	 * 
	 * 
	 */
	public static Object populate(Object input_row, Object output_row,
			Object reference_row) {
		String fieldAppend = "";
		try {
			// Object rc = output_row.getClass().newInstance();
			Field[] fields = reference_row.getClass().getDeclaredFields();
			for (Field field : fields) {
				if (!Modifier.isStatic(field.getModifiers())) {
					if (debug)
						System.out.println("field name: " + field.getName());
					field.setAccessible(true);// force the field to be
					// accessible.

					Object value = field.get(reference_row);
					if (debug)
						System.out.println("value = " + value);
					if (value != null) {
						String headerString = value.toString();
						if (debug)
							System.out.println("valueString = " + headerString);
						headerString = headerString
								.replaceAll("\\p{Punct}", "");
						headerString = headerString.replaceAll(" ", "_");
						if (debug)
							System.out.println("valueString is now: "
									+ headerString);

						Field outputField = output_row.getClass()
								.getDeclaredField(headerString + fieldAppend);
						Field inputField = input_row.getClass()
								.getDeclaredField(field.getName());
						outputField.setAccessible(true);
						inputField.setAccessible(true);
						if (headerString.equals("Primary_Attitude")) {
							// will only apply to the fields after this one
							fieldAppend = "_PA";
						}
						if (outputField == null || inputField == null) {
							throw new RuntimeException("Invalid Field Name");
						}
						outputField.set(output_row, inputField.get(input_row));
					}
				}
			}
			return output_row;
		} catch (Exception ex) {
			// do nothing, for now...
			System.err.println("Exception grabbing field value: "
					+ ex.getLocalizedMessage());
			throw new RuntimeException(ex);
		}
		// return null;
	}
}
