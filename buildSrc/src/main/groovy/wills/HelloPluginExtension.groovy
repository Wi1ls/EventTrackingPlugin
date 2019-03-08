package wills;

/**
 * Copyright (c) 2019, Bongmi
 * All rights reserved
 * Author: shenwei@bongmi.com
 */
public class HelloPluginExtension {
   String name

   int age

   boolean boy


  @Override
  public String toString() {
    return "HelloPluginExtension{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", boy=" + boy +
        '}'
  }
}
