/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;
import org.cloudbus.cloudsim.network.datacenter.NetworkHost;

/**
 * A physical host in the network. 
 * Currently it contains an instance of NetworkHost. If the packet implementation
 * from cloudsim is not used then, NetworkHost cannot be used.
 * 
 * NetworkHost cannot be used as it considers only packet send and receive.
 * It does not consider Computational workload.
 * 
 * TODO: would be good to implement the host from scratch (by extending Host)
 *  
 * @author Nitesh Dudhey
 *
 */
public class NetHost extends Node{
	
	public NetHost(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
	NetworkHost host;
	
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