/**
 * 
 */
package cloudsimExtension.cloudsimVDCEmbedding;

/**
 * The global constants.
 * 
 * @author Nitesh Dudhey.
 * 
 */
public final class Constants {
	public enum switchType {ROOT(0), AGGREGATE(1), EDGE(2);
		private int value;
		private switchType(int value){
			this.value = value;
		}	
	}
}