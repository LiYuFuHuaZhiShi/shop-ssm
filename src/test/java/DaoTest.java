import com.xpf.dao.UsersMapper;
import com.xpf.entity.ProDetail;
import com.xpf.entity.Product;
import com.xpf.entity.Users;
import com.xpf.service.ProductService;
import com.xpf.service.UsersService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class DaoTest extends TestUtil {


    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UsersService usersService;

    @Autowired
    private ProductService productService;

    @Test
    public void Test(){
        Users users = new Users("z","123","男","123456","南阳","5312564@qq.com");
        System.out.println(usersService.checkUser("z"));
    }

    @Test
    public void Test1(){
        Users users = new Users("z","123","男","123456","南阳","5312564@qq.com");
        System.out.println(usersService.userLogin("z","123"));
    }

    @Test
    public void Test2(){
        System.out.println(usersMapper.deleteByPrimaryKey(1));
    }

    @Test
    public void Test3(){
        List<Product> productList = productService.allProduct();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Test
    public void Test4(){
        List<ProDetail> productList = productService.allProductDetail();
        for (ProDetail p : productList) {
            System.out.println(p);
        }
    }

}
