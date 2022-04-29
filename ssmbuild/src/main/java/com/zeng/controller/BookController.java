package com.zeng.controller;

import com.zeng.pojo.Books;
import com.zeng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍，并返回到一个页面
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        for (Books books : list) {
            System.out.println(books);
        }
        return "allbook";
    }
    //新增书籍，跳转到增加书籍界面
    @RequestMapping("/toAddBook")
    public String addBookPaper(){

        return "addBook";
    }
    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println("addbook-->>"+books);
        bookService.addBook(books);
        return "redirect:/book/allbook";    //重定向到@RequestMapping("/allbook")界面
    }

    //修改书籍，跳转到修改界面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books book = bookService.queryBookById(id);
        System.out.println("upup==="+book);
        model.addAttribute("book",book);

        return "updateBook";
    }
    //修改书籍提交请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books, Model model){
        System.out.println("updateBook===>>"+books);
        bookService.updateBook(books);
        Books book = bookService.queryBookById(books.getBookID());
        model.addAttribute("book",book);

        return "redirect:/book/allbook";    //重定向到@RequestMapping("/allbook")界面
    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookid}")
    public String deleteBook(@PathVariable("bookid") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allbook";    //重定向到@RequestMapping("/allbook")界面
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(Model model,String queryBookName){
        System.out.println("queryBookName===>"+queryBookName);

        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if(books == null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",list);

        return "allbook";

    }

}
