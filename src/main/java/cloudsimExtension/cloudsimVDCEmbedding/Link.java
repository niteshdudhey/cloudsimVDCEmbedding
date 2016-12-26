/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

/**
 * A link between two nodes represented by their ids.
 * @author nitesh
 *
 */
public class Link {
	
	private int srcNodeID = 0;

	private int destNodeID = 0;

	private float linkDelay = 0;

	private float linkBw = 0;

	public Link(int srcNodeID, int destNodeID, float linkDelay, float linkBw) {
		this.srcNodeID = srcNodeID;
		this.destNodeID = destNodeID;
		this.linkDelay = linkDelay;
		this.linkBw = linkBw;
	}
	
}