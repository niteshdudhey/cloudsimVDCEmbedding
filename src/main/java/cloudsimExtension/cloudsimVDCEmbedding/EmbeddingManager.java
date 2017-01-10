package cloudsimExtension.cloudsimVDCEmbedding;

import java.util.List;
import java.util.Map;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;

public class EmbeddingManager extends SimEntity {
	
	/*
	 * The embedding policy currently associated with the 
	 * embedding manager. This object will be an implementation
	 * of the VDCEPolicy interface.
	 */
	VDCEPolicy policy;
	
	/*
	 * The list of VDCs currently being served.
	 */
	List<VDatacenter> currentList;
	
	/*
	 * The queue of waiting VDC Requests.
	 */
	List<VDatacenter> waitList;
	
	/*
	 * List of available Physical Datacenters.
	 */
	List<PDatacenter> datacenters;
	
	/*
	 * Map containing the time when the VDC Request
	 * was given to the embedding manager.
	 */
	Map<VDatacenter, Double> requestTime;
	
	/*
	 * Map containing the time at which a VDC Request
	 * was served.
	 */
	Map<VDatacenter, Double> servedTime;
	
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
