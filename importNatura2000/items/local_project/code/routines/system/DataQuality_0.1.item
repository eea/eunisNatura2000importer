// ============================================================================
//
// %GENERATED_LICENSE%
//
// ============================================================================
package routines;


public class DataQuality {

    /**
     * getTitle: Returns the extracted title based on a list of titles provided
     * 
     * {talendTypes} String
     * 
     * {Category} Data Quality
     * 
     * {param} string("Mrs. Marty Smith") the string to be processed
     * 
     * {example} getTitle(" Mrs. Marty Smith ", 1) # returns "Mrs."
     */
    public static String getTitle(String name) {
        return DQTechnical.extractTitle(name, 1);
    }

    /**
     * getNameWithoutTitle: Returns the string without the title
     * 
     * {talendTypes} String
     * 
     * {Category} Data Quality
     * 
     * {param} string("Mrs. Marty Smith") the string to be processed
     * 
     * {example} getNameWithoutTitle(" Mrs. Marty Smith ", 1) # returns "Marty Smith"
     */
    public static String getNameWithoutTitle(String name) {
        return DQTechnical.removeTitle(name, 1);
    }

    /**
     * getNameWithoutSuffix: Returns the string without the suffix
     * 
     * {talendTypes} String
     * 
     * {Category} Data Quality
     * 
     * {param} string("Mr. Marty Smith III") the string to be processed
     * 
     * {example} getNameWithoutSuffix(" Mr. Marty Smith III", 1) # returns "Mr. Marty Smith"
     */
    public static String getNameWithoutSuffix(String name) {
        return DQTechnical.removeNameSuffix(name, 1);
    }

    /**
     * getLastName: Returns only LastName value from the string
     * 
     * {talendTypes} String
     * 
     * {Category} Data Quality
     * 
     * {param} string("Mrs. Marty Smith III") the string to be processed
     * 
     * {example} getLastName(" Mrs. Marty Smith III", 1) # returns "Smith"
     */
    public static String getLastName(String name) {
        return DQTechnical.extractLastName(DQTechnical.removeNameSuffix(DQTechnical.removeTitle(name, 1), 1), 1);
    }

    /**
     * getCleansedLastName: Returns the string without the title and suffix
     * 
     * {talendTypes} String
     * 
     * {Category} Data Quality
     * 
     * {param} string("Mrs. Marty Smith III") the string to be processed
     * 
     * {example} getCleansedLastName(" Mrs. Marty Smith III", 1) # returns "Marty Smith"
     */
    public static String getCleansedLastName(String name) {
        return DQTechnical.removeNameSuffix(DQTechnical.removeTitle(name, 1), 1);
    }

    /**
     * isValidName: Returns true or false if the string is a valid formed name: [Initial] Firstname [Initial] Lastname
     * 
     * {talendTypes} Boolean
     * 
     * {Category} Data Quality
     * 
     * {param} string("Mrs. Marty Smith") the string to be processed
     * 
     * {example} isValidName("Mrs. Marty Smith ") # returns true
     */
    public static Boolean isValidName(String name) {
        return DQTechnical.isNameStringValid(DQTechnical.removeNameSuffix(DQTechnical.removeTitle(name, 1), 1));
    }
    
}
