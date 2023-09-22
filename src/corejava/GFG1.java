package corejava;

import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;

public class GFG1 {

	public static void main(String[] args) {
	     // create SimpleScriptContext object
        SimpleScriptContext simple
            = new SimpleScriptContext();
  
        // add some attribute using setAttribute()
        simple.setAttribute(
            "name1", "Value1",
            ScriptContext.GLOBAL_SCOPE);
  
        // print
        System.out.println("name1:"
                           + simple.getAttribute("name1"));
    }

	}


