import de.dependency.Demo;
import de.dependency.impl.DemoAlternativImpl;
import de.dependency.impl.DemoImpl;

module tag1_03JigsawDepenency {
	
	requires transitive tag1_04DepDep;
	
	exports de.dependency; // Paket
	exports de.tiere;
	
	uses Demo;
	provides Demo with DemoImpl,DemoAlternativImpl;
	
	opens de.tiere;
}