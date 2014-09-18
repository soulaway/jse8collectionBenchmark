/*
 * Copyright (c) 2005, 2014, Oracle and/or its affiliates. All rights reserved.
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

package com.github.soulaway;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(value = Scope.Benchmark ) 
public class CollectionsIterateBenchmmark {
	private List<Object> linkedList;
	private List<Object> arrayList;
	private List<Object> vector;
	private List<Object> stack;
	private Set<Object> hashSet;
	private Set<Object> treeSet;
	private Set<Object> linkedHashSet;
	private Map<String, Object> hashTable;
	private Map<String, Object> hashMap;
	private Map<String, Object> linkedHashMap;
	private Map<String, Object> treeMap;

	@Param({"1000", "10000", "100000"}) private int elementsCount;

	@Setup(Level.Trial)
	public void setup() {
		linkedList = new LinkedList<Object>();
		arrayList = new ArrayList<Object>();
		vector = new Vector<Object>();
		stack = new Stack<Object>();
		hashSet = new HashSet<Object>();
		treeSet = new TreeSet<Object>();
		linkedHashSet = new LinkedHashSet<Object>();
		hashTable = new Hashtable<String, Object>();
		hashMap = new HashMap<String, Object>();
		linkedHashMap = new LinkedHashMap<String, Object>();
		treeMap = new TreeMap<String, Object>();
		for (int i = 0; i < elementsCount; i++) {
			linkedList.add(new Integer(i));
			arrayList.add(new Integer(i));
			vector.add(new Integer(i));
			stack.add(new Integer(i));
			hashSet.add(new Integer(i));
			treeSet.add(new Integer(i));
			linkedHashSet.add(new Integer(i));
			hashTable.put(String.valueOf(i),new Integer(i));
			hashMap.put(String.valueOf(i),new Integer(i));
			linkedHashMap.put(String.valueOf(i),new Integer(i));
			treeMap.put(String.valueOf(i),new Integer(i));
		}
	}

	@Benchmark
	public void iterateLinkedList(){
		linkedList.stream().forEach(e -> e.hashCode());	
	}
	
	@Benchmark
	public void iterateArrayList() {
		arrayList.stream().forEach(e -> e.hashCode());	
	}

	@Benchmark
	public void iterateVector() {
		vector.stream().forEach(e -> e.hashCode());	
	}

	@Benchmark
	public void iterateStack(){
		stack.stream().forEach(e -> e.hashCode());	
	}
	
	@Benchmark
	public void iterateHashSet() {
		hashSet.stream().forEach(e -> e.hashCode());	
	}

	@Benchmark
	public void iterateTreeSet(){
		treeSet.stream().forEach(e -> e.hashCode());	
	}
	@Benchmark
	public void iterateLinkedHashSet() {
		linkedHashSet.stream().forEach(e -> e.hashCode());	
	}

	@Benchmark
	public void iterateHashtable(){
		hashTable.entrySet().stream().forEach(e -> e.hashCode());	
	}
	@Benchmark
	public void iterateHashMap() {
		hashMap.entrySet().stream().forEach(e -> e.hashCode());	
	}

	@Benchmark
	public void iterateLinkedHashMap(){
		linkedHashMap.entrySet().stream().forEach(e -> e.hashCode());	
	}
	@Benchmark
	public void iterateTreeMap() {
		treeMap.entrySet().stream().forEach(e -> e.hashCode());	
	}
}