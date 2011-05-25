/*
 * Copyright (c) 2000, 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders;

/**
 * com/sun/corba/se/impl/protocol/giopmsgheaders/IORAddressingInfoHelper.java
 * Generated by the IDL-to-Java compiler (portable), version "3.0" from
 * ../../../../../../../src/share/classes/com/sun/corba/se/GiopIDL/g.idl Sunday,
 * June 4, 2000 5:18:54 PM PDT
 */

abstract public class IORAddressingInfoHelper {
	private static String _id = "IDL:messages/IORAddressingInfo:1.0";

	public static void insert(org.omg.CORBA.Any a,
			IORAddressingInfo that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static IORAddressingInfo extract(
			org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;
	private static boolean __active = false;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			synchronized (org.omg.CORBA.TypeCode.class) {
				if (__typeCode == null) {
					if (__active) {
						return org.omg.CORBA.ORB.init()
								.create_recursive_tc(_id);
					}
					__active = true;
					org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[2];
					org.omg.CORBA.TypeCode _tcOf_members0 = null;
					_tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(
							org.omg.CORBA.TCKind.tk_ulong);
					_members0[0] = new org.omg.CORBA.StructMember(
							"selected_profile_index", _tcOf_members0, null);
					_tcOf_members0 = org.omg.IOP.IORHelper.type();
					_members0[1] = new org.omg.CORBA.StructMember("ior",
							_tcOf_members0, null);
					__typeCode = org.omg.CORBA.ORB
							.init()
							.create_struct_tc(
									IORAddressingInfoHelper
											.id(), "IORAddressingInfo",
									_members0);
					__active = false;
				}
			}
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static IORAddressingInfo read(
			org.omg.CORBA.portable.InputStream istream) {
		IORAddressingInfo value = new IORAddressingInfo();
		value.selected_profile_index = istream.read_ulong();
		value.ior = org.omg.IOP.IORHelper.read(istream);
		return value;
	}

	public static void write(
			org.omg.CORBA.portable.OutputStream ostream,
			IORAddressingInfo value) {
		ostream.write_ulong(value.selected_profile_index);
		org.omg.IOP.IORHelper.write(ostream, value.ior);
	}

}
