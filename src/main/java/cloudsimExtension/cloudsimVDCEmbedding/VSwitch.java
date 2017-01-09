/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEvent;

/**
 * @author Nitesh Dudhey
 *
 */
public class VSwitch extends Node {

	/*
	 * The id of the physical datacenter in which the switch is located.
	 */
	private int datacenterId;
	
	/*
	 * The type of switch (ROOT, AGGRETATE OR EDGE).
	 */
	private Constants.switchType type;
	
	/*
	 * The latency of the network where the switch is connected to.
	 */
	private double latency;
	
	/*
	 * The time the switch spends to process a received packet.
	 */
	private double switchingDelay;
	
	// TODO: this is not implemented yet. Also these may or may not be needed.
	ForwardingRule forwardingTable;
	RoutingTable routingTable;	
	
	
	public VSwitch(String name, int datacenterId, int id, Constants.switchType type, double latency, double switchingDelay) {
		super(name, id);
		
		setType(type);
		setDatacenterId(datacenterId);
		this.latency = latency;
		this.switchingDelay = switchingDelay;
	}


	/**
	 * @return the datacenterId
	 */
	public int getDatacenterId() {
		return datacenterId;
	}


	/**
	 * @param datacenterId the datacenterId to set
	 */
	public void setDatacenterId(int datacenterId) {
		this.datacenterId = datacenterId;
	}


	/**
	 * @return the type
	 */
	public Constants.switchType getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(Constants.switchType type) {
		this.type = type;
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
