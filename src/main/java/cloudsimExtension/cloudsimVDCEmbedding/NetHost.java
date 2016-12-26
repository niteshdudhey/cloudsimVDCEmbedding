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
 * TODO: would be good to implement the host from scratch (by extending Host)
 *  
 * @author nitesh
 *
 */
public class NetHost extends SimEntity implements Node{
	
	private int id;
	
	public NetHost(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	NetworkHost host;

	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
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