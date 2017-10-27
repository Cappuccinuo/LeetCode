<code>List<Integer> list = new ArrayList<Integer>();</code></br>
<code>ArrayList<Integer> list1 = new ArrayList<Integer>();</code></br>
<code>List<List<Integer>> list2 = new ArrayList<List<Integer>>();</code></br>
<code>list.add(0);</code></br>
<code>list.add(0,1);</code></br>
<code>list.get(0);</code></br>
<code>list.size();</code></br>
<code>list.remove(list.size() - 1);</code></br>
<code>Collections.sort(list);</code></br>
<code>Collections.sort(list, Collections.reverseOrder());</code></br>
<code>Collections.sort(list, new Comparator<Integer>()) {
          public int compare(Integer o1, Integer o2) {
              return o1 - o2;//0->1
              return o2 - o1;//1->0
          }
}</code></br>
