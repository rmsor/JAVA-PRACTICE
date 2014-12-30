package module;

import java.util.prefs.Preferences;

public class Preference {
	private Preferences prefs;
	public Preference(){
		prefs = Preferences.userNodeForPackage(this.getClass());
	}
	public void putVal(String key,String val){		
		prefs.put(key, val);
	}
	public String getVal(String key){
		return prefs.get(key, "");
	}
}
