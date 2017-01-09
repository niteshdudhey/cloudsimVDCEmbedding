/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEvent;

/**
 * @author Nitesh Dudhey
 *
 */
public class VLink extends Link {
	
	/*
	 * The path that is mapped to the virtual link.
	 */
	private PhysicalPath physicalPath;
	
	public VLink(String name, int id, int srcNode, int destNode, float delay, float bandwidth) {
		super(name, id, srcNode, destNode, delay, bandwidth);
		
		physicalPath = new PhysicalPath();
	}

	@Override
	public void startEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processEvent(SimEvent ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shutdownEntity() {
		// TODO Auto-generated method stub
		
	}

}
