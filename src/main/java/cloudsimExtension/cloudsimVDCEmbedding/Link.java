/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

/**
 * A link (as an abstract class) between two nodes represented by their ids.
 * The link is characterized by its delay and bandwidth.
 *  
 * @author Nitesh Dudhey
 *
 */
public abstract class Link extends NetworkEntity {
	
	public Link(String name, int id, int srcNode, int destNode, float delay, float bandwidth) {
		super(name, id);
		
		setSrcNode(srcNode);
		setDestNode(destNode);
		setDelay(delay);
		setBandwidth(bandwidth);
	}
	
	private int srcNode;

	private int destNode;

	private float delay;

	private float bandwidth;

	public int getSrcNode() {
		return srcNode;
	}

	public void setSrcNode(int srcNode) {
		this.srcNode = srcNode;
	}

	public int getDestNode() {
		return destNode;
	}

	public void setDestNode(int destNode) {
		this.destNode = destNode;
	}

	public float getDelay() {
		return delay;
	}

	public void setDelay(float delay) {
		this.delay = delay;
	}

	public float getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(float bandwidth) {
		this.bandwidth = bandwidth;
	}	
}