
package tadp.examples;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MappingStandaloneSetup extends MappingStandaloneSetupGenerated{

	public static void doSetup() {
		new MappingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

