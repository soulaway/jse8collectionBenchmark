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
import java.util.Collection;
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
import org.openjdk.jmh.annotations.TearDown;

@State(value = Scope.Benchmark ) 
public class CollectionsInsertBenchmmark {
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

	@Setup(Level.Iteration)
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
	}
	
	@TearDown(Level.Iteration)
	public void tearDown(){
		linkedList = null;
		arrayList = null;
		vector = null;
		stack = null;
		hashSet = null;
		treeSet = null;
		linkedHashSet = null;
		hashTable = null;
		hashMap = null;
		linkedHashMap = null;
		treeMap = null;
	}
	
	public void collectionBatchInsert(Collection<Object> c){
		for (int i = 0; i < elementsCount; i++) {
			c.add(new Integer(i));
		}		
	}
	
	@Benchmark
	public void insertLinkedList() {
		collectionBatchInsert(linkedList);
	}
	
	@Benchmark
	public void insertArrayList() {
		collectionBatchInsert(arrayList);
	}

	@Benchmark
	public void insertVector() {
		collectionBatchInsert(vector);
	}

	@Benchmark
	public void insertStack(){
		collectionBatchInsert(stack);
	}
	
	@Benchmark
	public void insertHashSet() {
		collectionBatchInsert(hashSet);
	}

	@Benchmark
	public void insertTreeSet(){
		collectionBatchInsert(treeSet);
	}

	@Benchmark
	public void insertLinkedHashSet() {
		collectionBatchInsert(linkedHashSet);
	}
	
	public void mapBatchPut(Map<String, Object> map){
		for (int i = 0; i < elementsCount; i++) {
			map.put(String.valueOf(i), new Integer(i));
		}		
	}
	
	@Benchmark
	public void insertHashtable(){
		mapBatchPut(hashTable);	
	}
	
	@Benchmark
	public void insertHashMap() {
		mapBatchPut(hashMap);
	}

	@Benchmark
	public void insertLinkedHashMap(){
		mapBatchPut(linkedHashMap);
	}
	
	@Benchmark
	public void insertTreeMap() {
		mapBatchPut(treeMap);
	}
}