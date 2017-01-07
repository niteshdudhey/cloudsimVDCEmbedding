package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;

/**
 * A switch in both physical and virtual network.
 * 
 * @author Nitesh Dudhey
 *
 */
public class Switch extends Node {
	
	public Switch(String name, int id, Constants.switchType type) {
		super(name, id);
		setType(type);
	}

	private Constants.switchType type;
	
	public Constants.switchType getType() {
		return type;
	}

	public void setType(Constants.switchType type) {
		this.type = type;
	}

	ForwardingRule forwardingTable;
	RoutingTable routingTable;	
	
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