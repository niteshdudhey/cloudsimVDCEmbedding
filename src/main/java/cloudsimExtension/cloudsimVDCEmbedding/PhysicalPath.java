/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

import java.util.ArrayList;
import java.util.List;

/**
 * A physical path that is mapped to a virtual link.
 * An entity consists of both Node and the links between them.
 * 
 * @author Nitesh Dudhey
 *
 */
public class PhysicalPath {
	private List<NetworkEntity> entities;
	
	public PhysicalPath(){
		entities = new ArrayList<NetworkEntity>();
	}
	
	public void addEntity(NetworkEntity entity){
		entities.add(entity);
	}
	
	public int getPathLength(){
		return entities.size();
	}
	
	public NetworkEntity getEntity(int i){
		return entities.get(i);
	}
}
