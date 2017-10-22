package interpreter;
public class CommandNode implements Node{
	private Node node;
	public void parse(Context context){
		if(context.currentToken().equals("REPEAT")){
			node = new RepeatCommandNode();
			node.parse(context);
		}
		else{
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}
	public void execute(){
		node.execute();
	}
	public String toString(){
		return node.toString();
	}
}
