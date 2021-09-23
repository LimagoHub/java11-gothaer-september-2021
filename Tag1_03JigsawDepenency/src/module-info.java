import de.dependency.Demo;
import de.dependency.impl.DemoAlternativImpl;
import de.dependency.impl.DemoImpl;

module tag1_03JigsawDepenency {
	
	exports de.dependency; // Paket
	uses Demo;
	provides Demo with DemoImpl,DemoAlternativImpl;
}