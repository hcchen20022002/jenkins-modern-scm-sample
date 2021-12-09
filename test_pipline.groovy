node {
    // "test" is a globle lib name on jenkins setting
    //@Library("test") _

    //def e = new org.foo.execCmd()
    ssh "echo 123"
}
