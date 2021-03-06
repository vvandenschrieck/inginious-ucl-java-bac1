/*   Copyright (c) 2015, 2016 Massart Aurélie
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 
package student;

public class M11Q12Stu {

	// Code a verifier
	public static int minimum(Node n){
		Node current = n;
        int min = n.value;
        while(current.next != null){
        	current = current.next;
            if(current.value < min){
            	min = current.value;
            }
        }
        return min;        
	}
}
