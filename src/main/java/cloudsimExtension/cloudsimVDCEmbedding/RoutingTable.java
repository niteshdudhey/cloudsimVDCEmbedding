/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Routing table for a switch. (It is taken from cloudsimsdn)
 * 
 * @author Nitesh Dudhey
 *
 */
public class RoutingTable {
	Map<Node, List<Link>> table;
	
	public RoutingTable(){
		this.table = new HashMap<Node, List<Link>>();
	}
}