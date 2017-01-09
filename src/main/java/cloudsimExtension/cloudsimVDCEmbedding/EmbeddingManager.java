package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;

public class EmbeddingManager extends SimEntity {
	
	/*
	 * The embedding policy associated currently with the 
	 * embedding manager. This object will be an implementation
	 * of the VDCEPolicy interface.
	 */
	
	VDCEPolicy policy;
	
	List<VDatacenter> current;
	
	public EmbeddingManager(String name) {
		super(name);
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
