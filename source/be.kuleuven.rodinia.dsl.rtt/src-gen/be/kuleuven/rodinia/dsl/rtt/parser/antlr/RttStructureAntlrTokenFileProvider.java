/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.rtt.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RttStructureAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.tokens");
	}
}