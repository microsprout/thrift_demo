package demo2;

import org.apache.thrift.TException;

/**
 * Created by bigbean on 15/8/18.
 */
public class RobotService implements Robot.Iface {
    @Override
    public String sayHi(String name) throws TException {
        return name;
    }

    @Override
    public Person woAreYou(Person person) throws TException {
        Person p = new Person();
        p.setName("jiangwei");
        p.setAge(30);
        p.setSex(Sex.Man);
        return p;
    }

    @Override
    public int negative(int num) throws TException {
        return -num;
    }
}
