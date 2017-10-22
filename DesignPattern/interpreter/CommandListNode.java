package interpreter;
import java.util.*;
public class CommandListNode implements Node{
	private Vector list = new Vector();
	public void parse(Context context){
		while(true){
			if(context.currentToken()==null){
				System.err.println("Missing 'END'");
				break;
			}
			else if(context.currentToken().equals("END")){
				context.skipToken("END");
				break;
			}
			else{
				Node commandNode =new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
		}
	}
	public void execute(){
		Iterator it = list.iterator();
		while(it.hasNext()){
			((Node)it.next()).execute();
		}
	}
	public String toString(){
		String str = " ";
		Iterator it = list.iterator();
		while(it.hasNext()){
		   str+=" " + ((CommandNode)it.next()).toString();
		}
		return str;
	}
}

