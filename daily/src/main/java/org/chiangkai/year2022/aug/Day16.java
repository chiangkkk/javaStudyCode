package org.chiangkai.year2022.aug;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ChiangKai
 * @date 2022/8/16 17:15
 */
@Slf4j
public class Day16 {
    public static void main(String[] args) {

        Day16 day16 = new Day16();
        day16.stream();
    }

    public void stream() {
        List<Student> students = initData();
        Map<Sex, List<Student>> collect = initData().stream().collect(Collectors.groupingBy(Student::getSex));
        log.info("{}", collect);
    }

    public List<Student> initData() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("小明", 1, 9, Sex.Man));
        students.add(new Student("小红", 2, 9, Sex.Woman));
        students.add(new Student("小黄", 3, 4, Sex.Man));
        students.add(new Student("小蓝", 1, 9, Sex.Man));
        students.add(new Student("小绿", 2, 9, Sex.Woman));
        students.add(new Student("小青", 1, 8, Sex.Woman));
        students.add(new Student("小紫", 3, 9, Sex.Woman));
        students.add(new Student("张三", 1, 9, Sex.Man));
        students.add(new Student("王五", 1, 9, Sex.Man));
        students.add(new Student("李明", 2, 8, Sex.Man));
        students.add(new Student("小华", 1, 9, Sex.Man));

        return students;
    }

    @Data
    @AllArgsConstructor
    class Student {
        String name;
        Integer clazz;
        Integer age;
        Sex sex;
    }


    public enum Sex {
        Man("m", "男"),
        Woman("w", "女");
        final private String code;
        final private String desc;

        private Sex(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getSex() {
            return desc;
        }
    }
}
