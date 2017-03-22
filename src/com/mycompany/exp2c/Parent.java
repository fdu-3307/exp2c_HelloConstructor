/**
 * 
 */
package com.mycompany.exp2c;

/**
 * @author ilker
 *
 */
//public class Parent extends GrandParent implements HasName {
// NOTE ilker below is equivalent to above
public class Parent extends GrandParent {
	protected float wealth;
	
	public Parent() {
		super();
	}
	
	public Parent(float _debt, String _name, String _lastName, float _wealth) {
		super(_debt, _name, _lastName);
		wealth = _wealth;
	}
}
