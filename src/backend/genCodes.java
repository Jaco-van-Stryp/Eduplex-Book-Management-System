//Class Created On 2018.11.29 By Jaco van Stryp
package backend;

import java.util.UUID;

public class genCodes { 
    
    public String genStudent()
    {
        
        String code = UUID.randomUUID().toString().replace("-", "");
        code = code.substring(0,5);
        return code;
    }
      public String genBook()
    {
        
        String code = UUID.randomUUID().toString().replace("-", "");
        code = code.substring(0,5);
        return code;
    }

} 