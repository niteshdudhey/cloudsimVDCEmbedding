package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;

/**
 * A switch in both physical and virtual network.
 * @author nitesh
 *
 */
public class Switch extends SimEntity implements Node {
	
	private int id;
	
	private Constants.switchType type;
	
	ForwardingRule forwardingTable;
	RoutingTable routingTable;	
	
	public Switch(String name, Constants.switchType type) {
		super(name);
		this.type = type;
		// TODO Auto-generated constructor stub
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
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
}