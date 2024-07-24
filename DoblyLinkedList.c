// Doubly Linked List
#include <stdio.h>
#include <stdlib.h>
struct cse {
  int d;
  struct cse *next;
  struct cse *prev;
};
struct cse *head = NULL;
struct cse *tail = NULL;
int add_back(int x) {
  struct cse *newnode = (struct cse *)malloc(sizeof(struct cse));
  newnode->d = x;
  newnode->next = NULL;
  newnode->prev = NULL;
  if (head == NULL) {
    head = newnode;
    tail = newnode;
  } else {
    tail->next = newnode;
    newnode->prev = tail;
    tail = newnode;
  }
}
int display() {
  struct cse *t = head;
  while (t != NULL) {
    printf("%d\n", t->d);
    t = t->next;
  }
}
int displayrev() {
  struct cse *t = tail;
  while (t != NULL) {
    printf("%d\n", t->d);
    t = t->prev;
  }
}
void main() {
  add_back(1);
  add_back(2);
  add_back(3);
  add_back(4);
  add_back(5);
  add_back(6);
  add_back(7);

  // display();
  // // middle();
  // displayrev();
  pair();
}
int middle() {
  struct cse *h = head;
  struct cse *t = tail;
  // middle of Llist for odd number of nodes
  while (h->next != NULL && t->prev != NULL) {
    h = h->next;
    t = t->prev;
    if (h == t) {
      printf("Middle node is %d", h->d);
      break;
    }
  }
  // odd or even DoublylinkedList
  while (h != t && h->next != t) {
    h = h->next;
    t = t->prev;
  }
  if (h == t) {
    printf("odd");

  } else {
    printf("even");
  }
}
int evenorodd() {
  struct cse *t, *f, *s;
  f = head;
  s = head;
  int count = 0;
  while (f != NULL && f->next != NULL) {
    f = f->next->next;
    s = s->next;
    // printf("%d",s->d);
  }
  if (f == NULL)
    printf("Even");
  else
    printf("odd");
}
pair() {
  struct cse *t = head;
  while (t!=NULL && t->next != NULL) {
    printf("%d %d\n", t->d, t->next->d);
    t=t->next;
  }
}

