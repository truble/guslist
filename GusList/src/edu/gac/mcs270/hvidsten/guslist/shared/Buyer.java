package edu.gac.mcs270.hvidsten.guslist.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Buyer  implements IsSerializable{
	private String name="";
	
	public Buyer() {}
	
	public Buyer(String string) {
		name = string;
	}

}
