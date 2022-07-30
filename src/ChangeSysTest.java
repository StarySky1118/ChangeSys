import com.starysky.changesys.Account;
import com.starysky.changesys.SystemManu;

// 零钱通系统测试类
public class ChangeSysTest {
    public static void main(String[] args) {
        // 创建用户
        Account zzy = new Account(200);
        // 显示菜单
        SystemManu.showMenu(zzy);
    }
}
