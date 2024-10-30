package come.itheima.arrayList.studentSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //集合存储用户信息
        ArrayList<User> listUser = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {
            //登陆界面
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");

            String oringin = sc.next();
            switch (oringin) {
                case "1" -> logIn(listUser);
                case "2" -> signIn(listUser);
                case "3" -> keyForget(listUser);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("您输入的选择有误，请重新输入");
            }
        }

    }

    //通过用户名获取用户对象索引
    public static int getIndexUser(String userName, ArrayList<User> listUser) {
        //遍历listUser中的每个对象元素
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(userName)) {
                //System.out.println(true);
                return i;
            }
        }
        //System.out.println(false);
        return -1;
    }

    //登录
    public static boolean logIn(ArrayList<User> listUser) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        //验证用户名是否注册
        if (getIndexUser(userName, listUser) == -1) {
            //未注册
            System.out.println("用户名未注册，请先注册");
            //结束方法
            return false;
        }

        System.out.println("请输入密码");
        //输入密码
        String key = sc.next();

        String verifyNumber;

        //判断验证码
        while (true) {
            //生成验证码verify
            String verify = getVerifyNumber();
            System.out.println(verify);

            System.out.println("请输入验证码");
            //输入验证码
            verifyNumber = sc.next();
            //判断验证码是否正确,不正确则重新输入
            //验证码忽略大小写
            if (!verify.equalsIgnoreCase(verifyNumber)) {
                //重新输入
                System.out.println("验证码错误，请重新输入");
                continue;
            }
            //执行到此说明验证码正确，跳出循环，继续验证用户名和密码
            System.out.println("验证码正确");
            break;
        }
        //验证用户名和密码是否匹配，共三次机会
        //先获取用户名对应的索引
        int index = getIndexUser(userName, listUser);
        //判断密码是否正确
        for (int i = 3; i >= 1; i--) {
            if (!listUser.get(index).getKey().equals(key)) {
                //密码错误，重新输入
                if (i != 1) {
                    System.out.println("密码错误，重新输入，您还剩" + (i - 1) + "次机会");
                    //前两次验证失败后重新输入密码
                    key = sc.next();
                } else {
                    //最后一次验证，若仍错误则不再继续输入密码，直接返回登录界面
                    return false;
                }

            }
            //执行到此说明密码正确,提示并跳出验证循环
            System.out.println("登陆成功");
            //登录成功则直接创建学生管理系统对象，调用开始学生系统方法
            studentSystem ss = new studentSystem();
            ss.startStudentSystem();


            break;
        }
        //执行到此说明所有验证均成功，返回true
        return true;
    }

    //注册
    public static void signIn(ArrayList<User> listUser) {
        System.out.println("请输入用户名");
        //Scanner sc = new Scanner(System.in);

        String userName = "";
        //用户名设置与验证
        userName = setUserName(listUser);

        String key;
        // String keyEnsure;

        //密码设置与确认
        key = setKey();

        String idNumber;
        //身份证号码设置与确认
        idNumber = setIdNumber();

        String phoneNumber;
        phoneNumber = setPhoneNumber();

        //执行到此说明四个验证全部完成
        //创建用户对象，并存入用户list
        User user = new User(userName, key, idNumber, phoneNumber);
        listUser.add(user);
        System.out.println("注册成功");
    }

    //忘记密码
    public static void keyForget(ArrayList<User> listUser) {
        //录入用户名，检查存在与否
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        //获取用户索引
        int index = getIndexUser(userName, listUser);
        //判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
        if (index == -1) {
            //用户名不存在
            System.out.println("该用户未注册");
            //结束方法
            return;
        }
        //执行到此说明用户名存在，则输入身份证和手机号并验证
        System.out.println("请输入身份证号");
        String idNumber = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();
        if (!listUser.get(index).getIdNumber().equals(idNumber) || !listUser.get(index).getPhoneNumber().equals(phoneNumber)) {
            //验证失败
            System.out.println("账号信息不匹配，修改失败。");
            //结束
            return;
        }
        //执行到此说明信息匹配，可修改密码
        System.out.println("请输入修改后的密码");
        String newKey = sc.next();
        listUser.get(index).setKey(newKey);
        System.out.println("密码修改成功");

    }

    //手机号输入与验证
    public static String setPhoneNumber() {
        System.out.println("请输入手机号");
        String phoneNumber;
        //手机号验证,返回fallse表示验证失败
        Scanner sc = new Scanner(System.in);
        while (true) {
            phoneNumber = sc.next();
            if (!phoneNumberVerify(phoneNumber)) {
                System.out.println("手机号验证失败，请重新输入");
                continue;
            }
            System.out.println("手机号验证成功");
            break;
        }
        return phoneNumber;
    }

    //身份证号输入与验证
    public static String setIdNumber() {
        System.out.println("请输入身份证号");
        String idNumber;
        Scanner sc = new Scanner(System.in);
        //身份证号码验证,返回false表示不符要求
        while (true) {
            idNumber = sc.next();
            if (!idNumberVerify(idNumber)) {
                System.out.println("身份证验证失败，请重新输入");
                continue;
            }

            break;
        }
        System.out.println("身份证验证成功");
        return idNumber;
    }

    //密码设置与验证
    public static String setKey() {
        String key;
        String keyEnsure;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入密码");
            key = sc.next();
            System.out.println("请再次输入密码");
            keyEnsure = sc.next();
            //两次密码一致才能继续注册
            if (!key.equals(keyEnsure)) {
                //若不一致则重新输入密码
                System.out.println("两次密码不一致，请重新设置密码");
                //进入下次循环，重新设置密码
                continue;
            }
            //执行到此说明密码两次一样，继续设置后续信息
            System.out.println("密码设置成功");
            break;
        }
        return key;
    }

    public static String setUserName(ArrayList<User> listUser) {
        String userName;
        Scanner sc = new Scanner(System.in);
        while (true) {
            userName = sc.next();

            //验证用户名长度，不满足则重新输入,不满足时返回的是false
            if (!userNameLen(userName)) {
                System.out.println("用户名长度不符要求，请重新输入");
                continue;
            }
            //验证用户名格式，不满足则重新输入,不满足时返回的是false
            if (!userNameFormat(userName)) {
                System.out.println("用户名格式不符要求，请重新输入");
                continue;
            }

            //最后验证用户名唯一性，不唯一则重新输入
            if (getIndexUser(userName, listUser) >= 0) {
                //索引合法，表示用户名之前存在，即不唯一
                System.out.println("用户名已存在，请重新输入");
                continue;
            }
            //执行到此说明用户名符合三个要求，跳出循环，继续录入其他信息
            break;
        }
        return userName;
    }


    //检验用户名长度是否合法
    public static boolean userNameLen(String userName) {
        if (userName.length() < 3 || userName.length() > 15) {
            return false;
        }
        //执行到此说明用户名长度合法
        return true;
    }

    //验证用户名的数字字母格式是否符合格式,符合返回true
    public static boolean userNameFormat(String userName) {
        //分别记录用户名中字母与数字的个数
        int countNum = 0;
        int countLetter = 0;
        //获取字母与数字个数
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                //属于大写或小写字母范围
                countLetter++;
            } else if (c >= '0' && c <= '9') {
                //属于数字的范围
                countNum++;
            }
        }

        //验证是否只是数字和字母的组合，即数字个数加上字母个数为字符串长度
        if ((countLetter + countNum) != userName.length()) {
            //若不只有数字和字母，返回false
            return false;
        }

        //执行到此说明用户名符合字母和数字组合
        //验证是否是纯数字
        if (countLetter == 0) {
            //字母个数为0，即纯数字,返回false
            return false;
        }
        //执行到此说明用户名满足要求
        return true;
    }

    //身份证号码验证,符合要求返回true
    public static boolean idNumberVerify(String idNumber) {
        //验证长度是否为18
        if (idNumber.length() != 18) {
            //长度不满足直接返回false
            return false;
        }
        //执行到此说明满足长度18位
        //验证开头是否是0,以及前17位是否都为数字，以及最后一位的要求
        for (int i = 0; i < idNumber.length(); i++) {
            //如果是第一位，确定是否为0
            //也可以使用boolean flag = idNumber.startsWith("0");
            //测试此字符串从指定索引开始的子字符串是否以指定前缀开始
            //如果是指定前缀，返回值为true
            char c = idNumber.charAt(i);
            if (i == 0) {
                if (c == '0') {
                    //首位不为0
                    System.out.println("身份证号首位不能为0，不符要求");
                    return false;
                }
            } else if (i == idNumber.length() - 1) {
                //最后一位
                if ((c < '0' || c > '9') && (c != 'x') && (c != 'X')) {
                    //不在0~9，并且不为x，并且不为X，即不符要求
                    System.out.println("身份证号末位应为数字或x或X，不符要求");
                    return false;
                }
            } else {
                //除开首尾的其他位
                if (c < '0' || c > '9') {
                    //不为数字则不符要求
                    System.out.println("身份证号前17位必须是数字，不符要求");
                    return false;
                }
            }
        }
        //执行到此说明身份证的每一位都符合要求
        return true;


    }

    //电话号码验证
    public static boolean phoneNumberVerify(String phoneNumber) {
        //长度要求,必须11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //首位要求，不为0
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }
        //必须全为数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                //超出数字范围返回false
                return false;
            }

        }
        return true;
    }

    //生成验证码
    public static String getVerifyNumber() {
        //使用集合生成验证码
        ArrayList<Character> list = new ArrayList<>();
        Random r = new Random();
        /*Random r = new Random();
        //存放大小写字母,大写65~90，小写97~122
        char[] letter = new char[52];
        for (int i = 0; i < letter.length; i++) {
            //前26村大写
            if (i <= 25) {
                letter[i] = (char) (65 + i);
            } else {
                //后26存小写
                letter[i] = (char) (97 + i - 26);
            }
        }

        for (int i = 0; i < 5; i++) {
            //随机索引
            if (i == 4) {
                //最后一位存数字
                verify = verify + r.nextInt(10);
            } else {
                //前四位随机选取字母
                int index = r.nextInt(52);
                verify = verify + letter[index];
            }
        }*/
        //存放大小写字母
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //随机选取四个字母
        //字符串拼接使用stringbuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            //随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字母
            char c = list.get(index);
            //放入builder
            sb.append(c);
        }
        //添加随机数字到末尾
        int number = r.nextInt(10);
        sb.append(number);
        /*sb.append(number);
        //转换为字符数组
        char[] chs = verify.toCharArray();
        //数字与字母随机交换(字符数组的操作)
        int randomIndex = r.nextInt(4);
        char temp = chs[randomIndex];
        chs[randomIndex] = chs[4];
        chs[4] = temp;
        //重新转换为字符串
        String result = new String(chs);
        return result;*/
        //修改字符串内容，将末尾数字的位置改变为随机位置
        //将字符串转换为字符数组，再改变内容
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        //交换数字与随机索引的内容
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //重新将字符数组转换为字符串并返回
        return new String(arr);
    }


}
