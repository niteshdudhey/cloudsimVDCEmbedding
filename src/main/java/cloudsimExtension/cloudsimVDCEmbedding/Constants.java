/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

/**
 * @author nitesh
 * The global constants.
 */
public final class Constants {
	public enum switchType {ROOT(0), AGGREGATE(1), EDGE(2);
		private int value;
		private switchType(int value){
			this.value = value;
		}	
	}
}