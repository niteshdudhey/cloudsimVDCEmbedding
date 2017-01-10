package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;

import java.util.ArrayList;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;

public class DatacenterBroker extends SimEntity {
	
	/*
	 * The physical datacenter to which the broker 
	 * will submit requests. For example, VM migration 
	 * requests will be sent to this PDC.
	 */
	PDatacenter pdc;
	
	/*
	 * The embedding manager associated with the simulation.
	 * The broker will send VDC embedding requests to 
	 * the embedding manager.
	 */
	EmbeddingManager mgr;
	
	/*
	 * The list of cloudlets that will be submitted to
	 * the PDC by the broker.
	 * TODO: The workload related data members need to
	 * be added. 
	 */
	List<Cloudlet> cloudletList;
	
	public DatacenterBroker(String name) {
		super(name);
		this.cloudletList = new ArrayList<Cloudlet>();
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
