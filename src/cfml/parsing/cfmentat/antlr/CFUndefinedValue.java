/* 
 *  Copyright (C) 2000 - 2010 TagServlet Ltd
 *
 *  This file is part of Open BlueDragon (OpenBD) CFML Server Engine.
 *  
 *  OpenBD is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  Free Software Foundation,version 3.
 *  
 *  OpenBD is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with OpenBD.  If not, see http://www.gnu.org/licenses/
 *  
 *  Additional permission under GNU GPL version 3 section 7
 *  
 *  If you modify this Program, or any covered work, by linking or combining 
 *  it with any of the JARS listed in the README.txt (or a modified version of 
 *  (that library), containing parts covered by the terms of that JAR, the 
 *  licensors of this Program grant you additional permission to convey the 
 *  resulting work. 
 *  README.txt @ http://www.openbluedragon.org/license/README.txt
 *  
 *  http://www.openbluedragon.org/
 */

package cfml.parsing.cfmentat.antlr;

import java.util.List;


public class CFUndefinedValue extends cfData implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final CFUndefinedValue UNDEFINED = new CFUndefinedValue();
	
	private CFUndefinedValue(){
	}
	
	public String getString() {
		return "";
	}
	
	public String toString() {
		return "[undefined]";
	}
  
	public cfData duplicate() {
		return this;
	}
  
	/**
	 * The following methods are not allowed to be invoked for static instances.
	 */
	public void setQueryTableData( List queryTableData, int queryColumn ) {
		throw new UnsupportedOperationException( "static instance" );
	}
	
	public void setExpression( boolean exp ) {
		throw new UnsupportedOperationException( "static instance" );
    }
	
	public void setJavaCast( byte cast ) {
		throw new UnsupportedOperationException( "static instance" );
	}
	
	public void setReference( boolean b ) {
		throw new UnsupportedOperationException( "static instance" );
	}
	
	protected void setImplicit( boolean implicit ) {
		throw new UnsupportedOperationException( "static instance" );
	}
}
