/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

import org.cloudbus.cloudsim.core.SimEntity;
import org.cloudbus.cloudsim.core.SimEvent;

/**
 * The abstract class to represent a network entity in the simulation.
 * It extends SimEntity.
 * 
 * @author Nitesh Dudhey
 *
 */
public abstract class NetworkEntity extends SimEntity {

	public NetworkEntity(String name, int id) {
		super(name);
		setId(id);
	}
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
